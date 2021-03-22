package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Variación

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Varation {
    private Long id;
    private Float price;
    private ArrayList<AttributeCombination>attribute_combinations;
    private Integer available_quantity;
    private Integer sold_quantity;
    private ArrayList<String>sale_terms;
    private ArrayList<String> picture_id;
    private String catalog_product_id;

    /**
     * Método que retorna el valor de la variable id
     * @return Retorna el valor de la variable mencionada
     */
    public Long getId() {
        return id;
    }

    /**
     * Método que retorna el valor de la variable price
     * @return Retorna el valor de la variable mencionada
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Método que retorna el valor de la variable attribute_combinations
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<AttributeCombination> getAttribute_combinations() {
        return attribute_combinations;
    }

    /**
     * Método que retorna el valor de la variable available_quantity
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getAvailable_quantity() {
        return available_quantity;
    }

    /**
     * Método que retorna el valor de la variable sold_quantity
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getSold_quantity() {
        return sold_quantity;
    }

    /**
     * Método que retorna el valor de la variable sale_terms
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getSale_terms() {
        return sale_terms;
    }

    /**
     * Método que retorna el valor de la variable picture_id
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getPicture_id() {
        return picture_id;
    }

    /**
     * Método que retorna el valor de la variable catalog_product_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getCatalog_product_id() {
        return catalog_product_id;
    }
}
