package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Respuesta para el Vendedor

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class SellerResponse {
    private String site_id;
    private Seller seller;
    private Paging paging;
    private ArrayList<Product> results;
    private ArrayList<Product> secondary_results;
    private ArrayList<Product> related_results;
    private Sort sort;
    private  ArrayList<Sort> available_sorts;
    private  ArrayList<Filter> filters;
    private   ArrayList<Filter>available_filters;
    private String error;
    private Integer status;
    private ArrayList<String> cause;


    /**
     * Método que retorna el valor de la variable site_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getSite_id() {
        return site_id;
    }

    /**
     * Método que retorna el valor de la variable seller
     * @return Retorna el valor de la variable mencionada
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * Método que retorna el valor de la variable paging
     * @return Retorna el valor de la variable mencionada
     */
    public Paging getPaging() {
        return paging;
    }

    /**
     * Método que retorna el valor de la variable results
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Product> getResults() {
        return results;
    }

    /**
     * Método que retorna el valor de la variable secondary_results
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Product> getSecondary_results() {
        return secondary_results;
    }

    /**
     * Método que retorna el valor de la variable related_results
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Product> getRelated_results() {
        return related_results;
    }

    /**
     * Método que retorna el valor de la variable sort
     * @return Retorna el valor de la variable mencionada
     */
    public Sort getSort() {
        return sort;
    }

    /**
     * Método que retorna el valor de la variable available_sorts
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Sort> getAvailable_sorts() {
        return available_sorts;
    }

    /**
     * Método que retorna el valor de la variable filters
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Filter> getFilters() {
        return filters;
    }

    /**
     * Método que retorna el valor de la variable available_filters
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Filter> getAvailable_filters() {
        return available_filters;
    }
}
