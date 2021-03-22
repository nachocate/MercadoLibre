package com.example.mercadolibreapp.mvp.interfaces;
/**

 * Esta interfaz pertenece esquema MVP asociado a la pantalla que contiene la barra de busqueda de
 * un producto en la plataforma MercadoLibre.
 * Aquí se declaran los métodos pertenecientes a cada uno de las capas (Modelo, Vista , Presentador)
 * para la clase SearchBar.
 * Dicha interfaz contendrá los métodos con los que se relacionarán las diferentes capas entre sí,
 * generando una abstracción de la funcionalidad de los métodos de cada capa hacia afuera, y
 * brindando los canales comunicacionales entre ellas.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public interface SearchBar {

    /**
     * Interfaz asociada a la capa Vista
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuará
     * el presentador. La implementación de dichos métodos, se encuentra en la clase SearchBar
     */
    interface View{
        void showError (Integer error);
        void showAlert(Integer alert);
        void changeFragmentToItemList(String product);
    }

    /**
     * Interfaz asociada a la capa Presentador
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuarán las
     * capas vista y modelo. La implementación de dichos métodos, se encuentra en la clase
     * SearchBar.Presenter
     */
    interface Presenter{
        void searchProduct(String product);
    }

    /**
     * Interfaz asociada a la capa Modelo
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuará la
     * capas presentador. La implementación de dichos métodos, se encuentra en la clase
     * SearchBar.Model
     */
    interface Model{
    }

}
