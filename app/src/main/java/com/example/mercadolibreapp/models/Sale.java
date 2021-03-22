package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad venta

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Sale {
    private String period;
    private Integer completed;

    /**
     * Método que retorna el valor de la variable period
     * @return Retorna el valor de la variable mencionada
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Método que retorna el valor de la variable completed
     * @return Retorna el valor de la variable mencionada
     */
    public Integer getCompleted() {
        return completed;
    }
}
