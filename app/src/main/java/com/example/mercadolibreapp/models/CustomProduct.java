package com.example.mercadolibreapp.models;

import java.util.ArrayList;/**

 * Esta clase cumple la funcionalidad de gestioanr los elementos para mostrar en el Fragmento Detail
 * facilitando y ordenando el paso de información de una función a la otra. La misma es utilizada
 * unicamente en el presentador DetailPresenter.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class CustomProduct {

    private String tvName;
    private String tvProductFeatures;
    private String viewPager;
    private String tvPrice;
    private String tvOriginalPrice;
    private String tvConditionAndSoldQuiantity;
    private String tvSellerNickname;
    private String tvPowerLevelSellerStatus;
    private String tvLevelId;
    private ArrayList<Picture> pictures;
    private String urlProductLink;

    /**
     * Constructor de la clase Custom product
     * @param tvName nombre del producto
     * @param tvProductFeatures características del producto
     * @param viewPager
     * @param tvPrice precio del producto
     * @param tvOriginalPrice precio original del producto
     * @param tvConditionAndSoldQuiantity condición del producto y cantidad vendida
     * @param tvSellerNickname nickname del vendedor
     * @param tvPowerLevelSellerStatus status del vendedor
     * @param tvLevelId reputación del vendedor
     * @param pictures imagenes del producto
     * @param urlProductLink link de la publicación.
     */
    public CustomProduct(String tvName, String tvProductFeatures, String viewPager, String tvPrice, String tvOriginalPrice, String tvConditionAndSoldQuiantity, String tvSellerNickname, String tvPowerLevelSellerStatus, String tvLevelId, ArrayList<Picture> pictures, String urlProductLink) {
        this.tvName = tvName;
        this.tvProductFeatures = tvProductFeatures;
        this.viewPager = viewPager;
        this.tvPrice = tvPrice;
        this.tvOriginalPrice = tvOriginalPrice;
        this.tvConditionAndSoldQuiantity = tvConditionAndSoldQuiantity;
        this.tvSellerNickname = tvSellerNickname;
        this.tvPowerLevelSellerStatus = tvPowerLevelSellerStatus;
        this.tvLevelId = tvLevelId;
        this.pictures = pictures;
        this.urlProductLink = urlProductLink;
    }
    /**
     * Método que retorna el valor de la variable tvName
     * @return Retorna el valor de la variable mencionada
     */
    public String getTvName() {
        return tvName;
    }
    /**
     * Método que retorna el valor de la variable tvProductFeatures
     * @return Retorna el valor de la variable mencionada
     */
    public String getTvProductFeatures() {
        return tvProductFeatures;
    }
    /**
     * Método que retorna el valor de la variable viewPager
     * @return Retorna el valor de la variable mencionada
     */
    public String getViewPager() {
        return viewPager;
    }
    /**
     * Método que retorna el valor de la variable tvPrice
     * @return Retorna el valor de la variable mencionada
     */
    public String getTvPrice() {
        return tvPrice;
    }
    /**
     * Método que retorna el valor de la variable tvOriginalPrice
     * @return Retorna el valor de la variable mencionada
     */
    public String getTvOriginalPrice() {
        return tvOriginalPrice;
    }
    /**
     * Método que retorna el valor de la variable tvConditionAndSoldQuiantity
     * @return Retorna el valor de la variable mencionada
     */
    public String getTvConditionAndSoldQuiantity() {
        return tvConditionAndSoldQuiantity;
    }
    /**
     * Método que retorna el valor de la variable tvSellerNickname
     * @return Retorna el valor de la variable mencionada
     */
    public String getTvSellerNickname() {
        return tvSellerNickname;
    }
    /**
     * Método que retorna el valor de la variable tvPowerLevelSellerStatus
     * @return Retorna el valor de la variable mencionada
     */
    public String getTvPowerLevelSellerStatus() {
        return tvPowerLevelSellerStatus;
    }
    /**
     * Método que retorna el valor de la variable tvLevelId
     * @return Retorna el valor de la variable mencionada
     */
    public String getTvLevelId() {
        return tvLevelId;
    }
    /**
     * Método que retorna el valor de la variable pictures
     * @return Retorna el valor de la variable mencionada
     */
    public ArrayList<Picture> getPictures() {
        return pictures;
    }
    /**
     * Método que retorna el valor de la variable urlProductLink
     * @return Retorna el valor de la variable mencionada
     */
    public String getUrlProductLink() {
        return urlProductLink;
    }
}
