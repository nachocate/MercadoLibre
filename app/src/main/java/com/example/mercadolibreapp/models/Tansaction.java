package com.example.mercadolibreapp.models;

/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Transacción

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Tansaction {
    private Integer total;
    private Integer canceled;
    private String period;
    private Rating ratings;
    private Integer completed;


    /**
     * Método que retorna el valor de la variable total
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Método que retorna el valor de la variable canceled
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getCanceled() {
        return canceled;
    }

    /**
     * Método que retorna el valor de la variable period
     * @return Retorna el valor de la variable mencionada
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Método que retorna el valor de la variable ratings
     * @return Retorna el valor de la variable mencionada
     */
    public Rating getRatings() {
        return ratings;
    }

    /**
     * Método que retorna el valor de la variable completed
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getCompleted() {
        return completed;
    }
}
