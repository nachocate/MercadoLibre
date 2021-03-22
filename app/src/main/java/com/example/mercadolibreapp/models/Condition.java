package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Condición.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Condition {
    private ArrayList<Restriction> context_restictions;
    private String start_time;
    private String end_time;
    private Boolean eligible;


    /**
     * Método que retorna el valor de la variable context_restictions
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Restriction> getContext_restictions() {
        return context_restictions;
    }
    /**
     * Método que retorna el valor de la variable start_time
     * @return Retorna el valor de la variable mencionada
     */
    public String getStart_time() {
        return start_time;
    }
    /**
     * Método que retorna el valor de la variable variable
     * @return Retorna el valor de la variable mencionada
     */
    public String getEnd_time() {
        return end_time;
    }
    /**
     * Método que retorna el valor de la variable eligible
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getEligible() {
        return eligible;
    }
}
