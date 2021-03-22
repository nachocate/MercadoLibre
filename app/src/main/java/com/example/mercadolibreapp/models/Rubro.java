package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Rubro

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Rubro {

    private String id;
    private String name;
    private String category_id;

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
     * Método que retorna el valor de la variable category_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getCategory_id() {
        return category_id;
    }
}
