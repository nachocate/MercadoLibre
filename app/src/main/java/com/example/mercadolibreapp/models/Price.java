package com.example.mercadolibreapp.models;

/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Precio

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Price {
    private String id;
    private String type;
    private Condition conditions;
    private Float amount;
    private Float regular_amount;
    private String currency_id;
    private String exchange_rate_context;
    private Metadata metadata;
    private String last_updated;

    /**
     * Método que retorna el valor de la variable id
     * @return Retorna el valor de la variable mencionada
     */
    public String getId() {
        return id;
    }

    /**
     * Método que retorna el valor de la variable type
     * @return Retorna el valor de la variable mencionada
     */
    public String getType() {
        return type;
    }

    /**
     * Método que retorna el valor de la variable conditions
     * @return Retorna el valor de la variable mencionada
     */
    public Condition getConditions() {
        return conditions;
    }

    /**
     * Método que retorna el valor de la variable amount
     * @return Retorna el valor de la variable mencionada
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * Método que retorna el valor de la variable regular_amount
     * @return Retorna el valor de la variable mencionada
     */
    public Float getRegular_amount() {
        return regular_amount;
    }

    /**
     * Método que retorna el valor de la variable currency_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getCurrency_id() {
        return currency_id;
    }

    /**
     * Método que retorna el valor de la variable exchange_rate_context
     * @return Retorna el valor de la variable mencionada
     */
    public String getExchange_rate_context() {
        return exchange_rate_context;
    }

    /**
     * Método que retorna el valor de la variable metadata
     * @return Retorna el valor de la variable mencionada
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Método que retorna el valor de la variable last_updated
     * @return Retorna el valor de la variable mencionada
     */
    public String getLast_updated() {
        return last_updated;
    }
}
