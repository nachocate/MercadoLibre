package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad envío

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Shipping {
    private Boolean free_shipping;
    private String mode;
    private ArrayList<String> tags;
    private String logistic_type;
    private Boolean store_pick_up;

    /**
     * Método que retorna el valor de la variable free_shipping
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getFree_shipping() {
        return free_shipping;
    }

    /**
     * Método que retorna el valor de la variable mode
     * @return Retorna el valor de la variable mencionada
     */
    public String getMode() {
        return mode;
    }

    /**
     * Método que retorna el valor de la variable tags
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getTags() {
        return tags;
    }

    /**
     * Método que retorna el valor de la variable logistic_type
     * @return Retorna el valor de la variable mencionada
     */
    public String getLogistic_type() {
        return logistic_type;
    }

    /**
     * Método que retorna el valor de la variable store_pick_up
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getStore_pick_up() {
        return store_pick_up;
    }
}
