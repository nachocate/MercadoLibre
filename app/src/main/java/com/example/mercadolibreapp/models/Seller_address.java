package com.example.mercadolibreapp.models;

/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Dirección del vendedor

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Seller_address {
    private String id;
    private String comment;
    private String address_line;
    private String zip_code;
    private Location country;
    private State state;
    private Location city;
    private String latitude;
    private String longitude;


    /**
     * Método que retorna el valor de la variable id
     * @return Retorna el valor de la variable mencionada
     */
    public String getId() {
        return id;
    }

    /**
     * Método que retorna el valor de la variable comment
     * @return Retorna el valor de la variable mencionada
     */
    public String getComment() {
        return comment;
    }

    /**
     * Método que retorna el valor de la variable address_line
     * @return Retorna el valor de la variable mencionada
     */
    public String getAddress_line() {
        return address_line;
    }

    /**
     * Método que retorna el valor de la variable zip_code
     * @return Retorna el valor de la variable mencionada
     */
    public String getZip_code() {
        return zip_code;
    }

    /**
     * Método que retorna el valor de la variable country
     * @return Retorna el valor de la variable mencionada
     */
    public Location getCountry() {
        return country;
    }

    /**
     * Método que retorna el valor de la variable state
     * @return Retorna el valor de la variable mencionada
     */
    public State getState() {
        return state;
    }

    /**
     * Método que retorna el valor de la variable city
     * @return Retorna el valor de la variable mencionada
     */
    public Location getCity() {
        return city;
    }

    /**
     * Método que retorna el valor de la variable latitude
     * @return Retorna el valor de la variable mencionada
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Método que retorna el valor de la variable longitude
     * @return Retorna el valor de la variable mencionada
     */
    public String getLongitude() {
        return longitude;
    }
}