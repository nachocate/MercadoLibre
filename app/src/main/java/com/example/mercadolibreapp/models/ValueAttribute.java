package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Atributo de Valor

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */

public class ValueAttribute {
    private String id;
    private String name;
    private String struct;

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
     * Método que retorna el valor de la variable struct
     * @return Retorna el valor de la variable mencionada
     */
    public String getStruct() {
        return struct;
    }
}
