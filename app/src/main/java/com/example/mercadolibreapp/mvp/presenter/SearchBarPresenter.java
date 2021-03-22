package com.example.mercadolibreapp.mvp.presenter;


import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.mvp.interfaces.SearchBar;
import com.example.mercadolibreapp.mvp.model.SearchBarModel;
/**

 * Esta clase representa el Presentador (dentro del patron de diseño MVP) para la clase SearchBar.
 * Aquí se manipularán los datos obtenidos del modelo, para luego, enviarlos a la vista.
 * Además,dicha clase se corresponde con busqueda el producto asociado sin considerar las peticiones
 * a la API

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class SearchBarPresenter implements SearchBar.Presenter {
    private SearchBar.View view;
    private SearchBar.Model model;

    /**
     * Constructor de la clase
     * @param view Interface de la vista de la clase SearchBar.
     */
    public SearchBarPresenter(SearchBar.View view) {
        this.view = view;
        model = new SearchBarModel(this);
    }

    /**
     * Método encargado de recepcionar el string asociado al producto buscado desde la vista,
     * realizarle las verificaciones necesarias, y en caso afirmativo, dar inicio al cambio de
     * fragmento.
     * @param product String asociado al nombre o descripción del producto buscado.
     *
     */
    @Override
    public void searchProduct(String product) {
        if (product == null) {
            view.showError(R.string.ERROR_UNKNOWN);
        } else {
            if (product.isEmpty()) {
                view.showAlert(R.string.ALERT_SEARCH_FIELD_EMPTY);
            } else {
                view.changeFragmentToItemList(product);
            }
        }
    }

}