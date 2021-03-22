package com.example.mercadolibreapp.mvp.presenter;


import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.models.ProductResponse;
import com.example.mercadolibreapp.mvp.interfaces.ItemList;
import com.example.mercadolibreapp.mvp.model.ItemListModel;

import java.util.ArrayList;

/**

 * Esta clase representa el Presentador (dentro del patron de diseño MVP) para la clase ItemListModel.
 * Aquí se manipularán los datos obtenidos del modelo, para luego, enviarlos a la vista.
 * Además,dicha clase se corresponde con la exposición de los productos coincidentes con el
 * producto solicitado por el usuario.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class ItemListPresenter implements ItemList.Presenter {
    private ItemList.Model model;
    private ItemList.View view;
    private ArrayList<Product> arrayProducts;


    /**
     * Constructor de la clase
     * @param view Interface de la vista de la clase ItemList.
     */
    public ItemListPresenter(ItemList.View view) {
        this.view = view;
        model = new ItemListModel(this);
        arrayProducts=new ArrayList<>();
    }


    /**
     * Método encargado de recepcionar el error desde el modelo y enviarlo hacia la vista.
     * @param error Integer asociado al String correspondiente, almacenado en strings.xml
     *
     */
    @Override
    public void showError(Integer error) {
        view.hideProgressBar();
        view.showError(error);
    }

    /**
     * Método encargado de recepcionar una alerta proveniente desde el modelo y enviarla hacia
     * la vista.
     * @param alert Integer asociado al String correspondiente, almacenado en strings.xml
     */
    @Override
    public void showAlert(Integer alert) {
        view.hideProgressBar();
        view.showAlert(alert);
    }


    /**
     * Método encargado de recepcionar el mensaje obtenido desde la Api, la cual retorna objeto con
     * los productos coincidentes junto a información extra, realizar las verificaciones necesarias
     * y posteriormente enviarlo a la vista en caso afirmativo.
     *  Vease ProductResult.class para mayor información
     * @param productResponse Clase que modela el resultado obtenido desde la Api asociado a productos
     * buscados
     */
    @Override
    public void onGetListProduct(ProductResponse productResponse) {
        arrayProducts= productResponse.getResults();
        if(arrayProducts!=null && arrayProducts.size()!=0){
            view.setListViewAdapter(arrayProducts);
        }else{
            view.showAlert(R.string.ALERT_PRODUCT_LIST_NOT_FOUND);
        }
        view.hideProgressBar();
     }

    /**
     * Método encargado de recepcionar el string con el nombre /descripción del prodcuto de la
     * vista y enviarlo al modelo.
     * @param item nombre /descripción del prodcuto
     *
     */
    @Override
    public void searchItemData(String item) {
        view.showProgressBar();
        model.searchItemData(item);
    }

    /**
     * Método encargado de buscar un producto dentro de la lista de prodcutos y retornarlo.
     * En el caso de no encontrar el elemento, emitirá un error al view, indicando dicha situación.
     * @param position posición del producto en la listView.
     *
     */
    @Override
    public void findProduct(Integer position) {
       if(arrayProducts!=null && (arrayProducts.size()-1)>=position){
            view.changeFragmentToProductDetail(arrayProducts.get(position).getId());
        }else{
           view.showError(R.string.ERROR_UNKNOWN);
       }
    }


    /**
     Método encargado de realizar una reasignación a null de los atributos instanciados y
     * utilizados en dicha clase
     */
    @Override
    public void onDestroy() {
        model.onDestroy();
    }


    /**
     Método encargado de agregar una instancia de la clase Product a la lista arrayProduct
     @param  product Instancia de Product a agregar
     */
    @Override
    public void addProductToArrayProducts(Product product) {
        arrayProducts.add(product);
    }

    /**
     Método encargado de retornar una instancia de producto existente dentro del arreglo, dado su
     indice.
     @param  index indice o posición del Producto en el arreglo
     @return retorna el producto encontrado
     */
    @Override
    public Product getProductToArrayProducts(Integer index) {
        return arrayProducts.get(index);
    }
}


















