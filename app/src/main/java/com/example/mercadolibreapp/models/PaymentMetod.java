package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Metodo de pago

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class PaymentMetod {
    private String id;
    private String description;
    private String type;

    /**
     * Método que retorna el valor de la variable id
     * @return Retorna el valor de la variable mencionada
     */
    public String getId() {
        return id;
    }

    /**
     * Método que retorna el valor de la variable description
     * @return Retorna el valor de la variable mencionada
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método que retorna el valor de la variable type
     * @return Retorna el valor de la variable mencionada
     */
    public String getType() {
        return type;
    }
}
