package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Rating

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Rating {
    private  Float negative;
    private  Float positive;
    private Float neutral;
    /**
     * Método que retorna el valor de la variable negative
     * @return Retorna el valor de la variable mencionada
     */
    public Float getNegative() {
        return negative;
    }
    /**
     * Método que retorna el valor de la variable positive
     * @return Retorna el valor de la variable mencionada
     */
    public Float  getPositive() {
        return positive;
    }
    /**
     * Método que retorna el valor de la variable neutral
     * @return Retorna el valor de la variable mencionada
     */
    public Float  getNeutral() {
        return neutral;
    }
}
