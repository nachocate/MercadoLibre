package com.example.mercadolibreapp.mvp.view;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.mvp.presenter.SearchBarPresenter;

/**

 * Esta clase representa la vista (dentro del patron de diseño MVP) para la clase SearchBar.
 * Aquí se declaran e inicializan los atributos y funciones a utilizar en la vista.
 * Dicha clase, posee lógica escasa o nula, dado que sus atributos son utilizados desde
 * el presentador por medio de los métodos aquí presentes
 * Dicha clase se corresponde con la presentación del detalle de un producto al usuario.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class SearchBar extends Fragment implements com.example.mercadolibreapp.mvp.interfaces.SearchBar.View {
    private com.example.mercadolibreapp.mvp.interfaces.SearchBar.Presenter mPresenter;
    private EditText etSearchBox;
    private Button btSearch;
    private ImageView imageView;
    //private View view;
    private Bundle savedState = null;

    /**
     * Constructor de la clase SearchBar, el cual se encuenta vacío por defecto.
     */
    public SearchBar() {
        // Required empty public constructor
    }

    /**
     * Método encargado de ejecutarse al crearse una instancia de tipo SearchBar.
     *
     * @param savedInstanceState Contiene la instancia del fragmento
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            etSearchBox.setText(savedInstanceState.getString("etSearchBar","Falló"));
            Log.d(getClass()+" onCreate","saveInstance!=null");
        }
        Log.d(getClass()+" onCreate","saveInstance==null");

    }

    /**
     * Método encargado de la creación de la vista asociada al fragmento.
     * Dicha función se encarga de conectar los atributos declarados con su correspondiente xml.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return Retorna el valor de la vista
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search_bar, container, false);
        getActivity().setTitle(R.string.SEARCH_BAR_TITLE);
        mPresenter = new SearchBarPresenter(this);
        this.btSearch = (Button) view.findViewById(R.id.btSearch);
        this.etSearchBox = (EditText) view.findViewById(R.id.etSearchBox);
        this.imageView = (ImageView) view.findViewById(R.id.ivImageSearchBar);
        this.btSearch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mPresenter.searchProduct(etSearchBox.getText().toString());
            }
        });
        return view;
    }

    /**
     * Método encargado de mostrar al usuario algún error proveniente tanto del presentador como del
     * modelo
     * @param error Valor entero asociado al error
     */
    @Override
    public void showError(Integer error) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
        alertDialog.setTitle(getString(R.string.ERROR_TITLE));
        alertDialog.setMessage(getString(error));
        alertDialog.setPositiveButton("Aceptar",null);
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
        alertDialog.setPositiveButton("Aceptar",null);
        alertDialog.show();
    }

    /**
     * Método encargado de realizar la transición al fragmento ItemList junto con el parámetro
     * requerido.
     * @param product String con el nombre/descripción del producto
     */
    @Override
    public void changeFragmentToItemList(String product){
        ItemList itemList=ItemList.newInstance(product);
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container,itemList,"ItemListFragment");
        transaction.addToBackStack(null);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    /**
     * Método sobrecargado para destruir/limpiar las dependencias asociadas a dicha clase, una vez
     * que el fragmento se destruya
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        imageView=null;
        btSearch=null;
        etSearchBox=null;
    }
}
