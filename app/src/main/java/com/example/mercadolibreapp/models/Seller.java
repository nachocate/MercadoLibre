package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Vendedor

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Seller {
    private Long id;
    private String nickname;
    private String permalink;
    private String registration_date;
    private Boolean car_dealer;
    private Boolean real_estate_agency;
    private ArrayList<String> tags;
    private SellerReputation seller_reputation;
    private Eshop eshop;
    private String site_id;

    /**
     * Método que retorna el valor de la variable id
     * @return Retorna el valor de la variable mencionada
     */
    public Long getId() {
        return id;
    }

    /**
     * Método que retorna el valor de la variable nickname
     * @return Retorna el valor de la variable mencionada
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Método que retorna el valor de la variable permalink
     * @return Retorna el valor de la variable mencionada
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * Método que retorna el valor de la variable registration_date
     * @return Retorna el valor de la variable mencionada
     */
    public String getRegistration_date() {
        return registration_date;
    }

    /**
     * Método que retorna el valor de la variable car_dealer
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getCar_dealer() {
        return car_dealer;
    }

    /**
     * Método que retorna el valor de la variable real_estate_agency
     * @return Retorna el valor de la variable mencionada
     */
    public Boolean getReal_estate_agency() {
        return real_estate_agency;
    }

    /**
     * Método que retorna el valor de la variable tags
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<String> getTags() {
        return tags;
    }

    /**
     * Método que retorna el valor de la variable seller_reputation
     * @return Retorna el valor de la variable mencionada
     */
    public SellerReputation getSeller_reputation() {
        return seller_reputation;
    }

    /**
     * Método que retorna el valor de la variable eshop
     * @return Retorna el valor de la variable mencionada
     */
    public Eshop getEshop() {
        return eshop;
    }

    /**
     * Método que retorna el valor de la variable site_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getSite_id() {
        return site_id;
    }
}
