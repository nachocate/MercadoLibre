package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Atributo de Filtro

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class ValueFilter {
    private String id;
    private String name;
    private ArrayList<Path> path_from_root;
    private Integer results;

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
     * Método que retorna el valor de la variable path_from_root
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Path> getPath_from_root() {
        return path_from_root;
    }

    /**
     * Método que retorna el valor de la variable results
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getResults() {
        return results;
    }
}
