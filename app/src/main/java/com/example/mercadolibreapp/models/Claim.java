package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad reclamo.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Claim {
    private Float rate;
    private Excluded excluded;
    private Integer value;
    private String period;
    /**
     * Método que retorna el valor de la variable rate
     * @return Retorna el valor de la variable mencionada
     */
    public Float getRate() {
        return rate;
    }
    /**
     * Método que retorna el valor de la variable excluded
     * @return Retorna el valor de la variable mencionada
     */
    public Excluded getExcluded() {
        return excluded;
    }
    /**
     * Método que retorna el valor de la variable value
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getValue() {
        return value;
    }
    /**
     * Método que retorna el valor de la variable period
     * @return Retorna el valor de la variable mencionada
     */
    public String getPeriod() {
        return period;
    }
}
