package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Imagenes

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */

public class Picture {
    private String id;
    private String url;
    private String secure_url;
    private String size;
    private String max_size;
    private String quality;


    /**
     * Método que retorna el valor de la variable id
     * @return Retorna el valor de la variable mencionada
     */
    public String getId() {
        return id;
    }

    /**
     * Método que retorna el valor de la variable url
     * @return Retorna el valor de la variable mencionada
     */
    public String getUrl() {
        return url;
    }

    /**
     * Método que retorna el valor de la variable secure_url
     * @return Retorna el valor de la variable mencionada
     */
    public String getSecure_url() {
        return secure_url;
    }

    /**
     * Método que retorna el valor de la variable size
     * @return Retorna el valor de la variable mencionada
     */
    public String getSize() {
        return size;
    }

    /**
     * Método que retorna el valor de la variable max_size
     * @return Retorna el valor de la variable mencionada
     */
    public String getMax_size() {
        return max_size;
    }

    /**
     * Método que retorna el valor de la variable quality
     * @return Retorna el valor de la variable mencionada
     */
    public String getQuality() {
        return quality;
    }
}
