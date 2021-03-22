package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad filtros.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Filter {
    private String id;
    private String name;
    private String text;
    private String type;
    private ArrayList<ValueFilter> values;


    /**
     * Método que retorna el valor de la variable id
     * @return Retorna el valor de la variable mencionada
     */
    public String getId() {
        return id;
    }


    /**
     * Método que retorna el valor de la variable name
     * @return Retorna el valor de la variable mencionada
     */
    public String getName() {
        return name;
    }

    /**
     * Método que retorna el valor de la variable text
     * @return Retorna el valor de la variable mencionada
     */
    public String getText() {
        return text;
    }

    /**
     * Método que retorna el valor de la variable values
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<ValueFilter> getValues() {
        return values;
    }
}
