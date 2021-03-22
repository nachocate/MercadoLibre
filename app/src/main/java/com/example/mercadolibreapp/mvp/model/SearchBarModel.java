package com.example.mercadolibreapp.mvp.model;


import com.example.mercadolibreapp.mvp.interfaces.SearchBar;

/**

 * Esta clase representa el Modelo (dentro del patron de diseño MVP) para la clase SearchBarModel.
 * La misma, cumplirá la función de responder a la llamada del presenter y buscar la información
 * solicitada por el mismo.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class SearchBarModel implements SearchBar.Model {

    private SearchBar.Presenter presenter;
    private  String dataRecived;

    /**
     * Constructor de la clase
     * @param presenter Interface del presentador de la clase SearchBarModel.
     */
    public SearchBarModel(SearchBar.Presenter presenter){
        this.presenter=presenter;
    }






}

