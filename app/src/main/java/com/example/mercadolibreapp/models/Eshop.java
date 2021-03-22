package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad de conmercio electronico (E-shop).

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */

public class Eshop {
    private String nick_name;
    private Rubro eshop_rubro;
    private Long eshop_id;
    private ArrayList<EshopLocation> eshop_locations;
    private String site_id;
    private String eshop_logo_url;
    private Integer eshop_status_id;
    private Long seller;
    private Integer eshop_experience;

    /**
     * Método que retorna el valor de la variable nick_name
     * @return Retorna el valor de la variable mencionada
     */
    public String getNick_name() {
        return nick_name;
    }
    /**
     * Método que retorna el valor de la variable eshop_rubro
     * @return Retorna el valor de la variable mencionada
     */
    public Rubro getEshop_rubro() {
        return eshop_rubro;
    }
    /**
     * Método que retorna el valor de la variable eshop_id
     * @return Retorna el valor de la variable mencionada
     */
    public Long getEshop_id() {
        return eshop_id;
    }
    /**
     * Método que retorna el valor de la variable eshop_locations
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<EshopLocation> getEshop_locations() {
        return eshop_locations;
    }
}
