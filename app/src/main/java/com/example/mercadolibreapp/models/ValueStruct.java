package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Structura de Valor
 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class ValueStruct {
    private String unit;
    private Float number;

    /**
     * Método que retorna el valor de la variable unit
     * @return Retorna el valor de la variable mencionada
     */

    public String getUnit() {
        return unit;
    }
    /**
     * Método que retorna el valor de la variable number
     * @return Retorna el valor de la variable mencionada
     */
    public Float getNumber() {
        return number;
    }
}
