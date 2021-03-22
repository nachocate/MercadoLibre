package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Locación del e-shop.
 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class EshopLocation{
    private State state;
    private Neighborhood neighborhood;
    private Country country;
    private City city;


    /**
     * Método que retorna el valor de la variable state
     * @return Retorna el valor de la variable mencionada
     */
    public State getState() {
        return state;
    }
    /**
     * Método que retorna el valor de la variable neighborhood
     * @return Retorna el valor de la variable mencionada
     */
    public Neighborhood getNeighborhood() {
        return neighborhood;
    }
    /**
     * Método que retorna el valor de la variable country
     * @return Retorna el valor de la variable mencionada
     */
    public Country getCountry() {
        return country;
    }
    /**
     * Método que retorna el valor de la variable city
     * @return Retorna el valor de la variable mencionada
     */
    public City getCity() {
        return city;
    }
}
