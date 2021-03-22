package com.example.mercadolibreapp.mvp.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.adapters.ProductAdapter;
import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.mvp.presenter.ItemListPresenter;

import java.util.ArrayList;

/**
 * Esta clase representa la vista (dentro del patron de diseño MVP) para la clase ItemList.
 * Aquí se declaran e inicializan los atributos y funciones a utilizar en la vista. Dicha clase,
 * posee lógica escasa o nula, dado que sus atributos son utilizados desde el presentador por medio
 * de los métodos aquí presentes. Dicha clase se corresponde con la presentación de la lista de
 * productos asociados a la previa busqueda del mismo.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class ItemList extends Fragment implements com.example.mercadolibreapp.mvp.interfaces.ItemList.View{
    private ListView lvProducts;
    private com.example.mercadolibreapp.mvp.interfaces.ItemList.Presenter mPresenter;
    private String productString;
    private ProgressBar pbLoading;
    private ProductAdapter productAdapter;


    /**
     * Constructor de la clase Detail, el cual se encuenta vacío por defecto.
     */
    public ItemList() {
    }

    /**
     * Método encargado de la creación de una nueva instancia del fragmento, junto con el pasaje de
     * argumentos.
     * @param productString string con el nombre/descripción del producto a buscar
     * @return Retorna el fragmento de tipo ItemList
     */
    public static ItemList newInstance(String productString) {
        ItemList fragment = new ItemList();
        Bundle args = new Bundle();
        args.putString("productString", productString);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Método encargado de ejecutarse al crearse una instancia de tipo Detail. En el mismo se
     * obtienen los argumentos pasados en caso de que existan.
     *
     * @param savedInstanceState Contiene la instancia del fragmento
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            productString = getArguments().getString("productString");
        }
    }

    /**
     * Método encargado de la creación de la vista asociada al fragmento.
     * Dicha función se encarga de conectar los atributos declarados con su correspondiente xml.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return View
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_item_list, container, false);
        getActivity().setTitle(R.string.ITEM_LIST_TITLE);
            mPresenter= new ItemListPresenter(this);
            this.lvProducts=(ListView)view.findViewById(R.id.lvProducts);
            this.pbLoading=(ProgressBar)view.findViewById(R.id.pbProgressBarItemList);
            lvProducts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                    mPresenter.findProduct(position);
                }
            });
            if(productString!=null){
                mPresenter.searchItemData(productString);
            }

        return view;
    }

    /**
     * Método encargado de mostrar al usuario algún error proveniente tanto del presentador como del
     * modelo
     * @param error Valor entero asociado al error
     */
    @Override
    public void showError(Integer error) {
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
        alertDialog.setTitle(getString(R.string.ERROR_TITLE));
        alertDialog.setMessage(getString(error));
        alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getActivity().onBackPressed();
            }
        });
        alertDialog.show();
    }

    /**
     * Método encargado de mostrar al usuario algúna advertencia proveniente tanto en el presentador
     * como del modelo
     * @param alert Valor entero asociado al error
     */
    @Override
    public void showAlert(Integer alert) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
        alertDialog.setTitle(getString(R.string.ALERT_TITLE));
        alertDialog.setMessage(getString(alert));
        alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getActivity().onBackPressed();
            }
        });
        alertDialog.show();
    }

    /**
     * Método encargado de crear el adaptador para el ListView, el cuál mostrará los productos
     * encontrados de la busqueda junto con una pequeña descripción de los mismos.
     * @param arrayListProduct Lista de instancias de la clase Product, asociadas a los productos
     * encontrados coincidentes.
     */
    @Override
    public void setListViewAdapter(ArrayList<Product> arrayListProduct){
        productAdapter= new ProductAdapter(getContext(), arrayListProduct);
        lvProducts.setAdapter(productAdapter);
    }

   /**
     * Método encargado de realizar la transición al fragmento Detail junto con el parámetro
     * requerido.
     * @param product String con el nombre/descripción del producto
     */
   /*
    @Override
    public void changeFragmentToProductDetail(Product product) {
        Detail detail=Detail.newInstance(product.getId());
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container,detail,"DetailFragment");
        transaction.addToBackStack(null);
        transaction.commit();
    }*/


    /**
     * Método encargado de realizar la transición al fragmento Detail junto con el parámetro
     * requerido.
     * @param productId String con el nombre/descripción del producto
     */
    @Override
    public void changeFragmentToProductDetail(String productId) {
        Detail detail=Detail.newInstance(productId);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container,detail,"DetailFragment");
        transaction.addToBackStack(null);
        transaction.commit();
    }

    /**
     * Método sobrecargado para destruir/limpiar las dependencias asociadas a dicha clase, una vez
     * que el fragmento se destruya. En dicho metodo se remueve la vista, la cual fue almacenada
     * para guardar el estado del fragmento.
     */
    public void onDestroyView() {
        super.onDestroyView();
        pbLoading=null;
        lvProducts=null;
        mPresenter.onDestroy();
    }

    /**
     * Método encargado de mostrar el progress bar mientras ocurren las llamadas a la API.
     */
    @Override
    public void showProgressBar() {
        pbLoading.setVisibility(View.VISIBLE);
    }

    /**
     * Método encargado de ocultar el progress bar una vez finalizada la llamada a la API,
     * independiente del resultado de la misma
     */
    @Override
    public void hideProgressBar() {
        pbLoading.setVisibility(View.GONE);
    }
}