package com.example.mercadolibreapp.mvp.interfaces;

import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.models.ProductResponse;

import java.util.ArrayList;
/**

 * Esta interfaz pertenece esquema MVP asociado  a la pantalla que lista los productos asociados con
 * una busqueda.
 * Aquí se declaran los métodos pertenecientes a cada uno de las capas (Modelo, Vista , Presentador)
 * para la clase ItemList.
 * Dicha interfaz contendrá los métodos con los que se relacionarán las diferentes capas entre sí,
 * generando una abstracción de la funcionalidad de los métodos de cada capa hacia afuera, y
 * brindando los canales comunicacionales entre ellas.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public interface ItemList {

    /**
     * Interfaz asociada a la capa Vista
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuará
     * el presentador. La implementación de dichos métodos, se encuentra en la clase ItemList
     */
    interface View{
        void showError(Integer error);
        void showAlert(Integer alert);
        //void changeFragmentToProductDetail(Product product);
        void changeFragmentToProductDetail(String productId);
        void showProgressBar();
        void hideProgressBar();
        void setListViewAdapter(ArrayList<Product> arrayListProduct);
    }

    /**
     * Interfaz asociada a la capa Presentador
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuarán las
     * capas vista y modelo. La implementación de dichos métodos, se encuentra en la clase
     * ItemList.Presenter
     */
    interface Presenter{
        void showError(Integer error);
        void showAlert(Integer alert);
        void onGetListProduct(ProductResponse productResponse);
        void searchItemData(String item);
        void findProduct(Integer position);
        void onDestroy();
        void addProductToArrayProducts(Product product);
        Product getProductToArrayProducts(Integer index);
    }

    /**
     * Interfaz asociada a la capa Modelo
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuará la
     * capas presentador. La implementación de dichos métodos, se encuentra en la clase
     * ItemList.Model
     */
    interface Model{
        void searchItemData(String item);
        void onDestroy();
    }

}
