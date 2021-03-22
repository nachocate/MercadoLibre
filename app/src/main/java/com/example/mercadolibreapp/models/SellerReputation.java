package com.example.mercadolibreapp.models;

/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Reputación del Vendedor.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class SellerReputation {
    private Tansaction transactions;
    private String power_seller_status;
    private Metric metrics;
    private String protection_end_date;
    private String real_level;
    private String level_id;

    /**
     * Método que retorna el valor de la variable transactions
     * @return Retorna el valor de la variable mencionada
     */
    public Tansaction getTransactions() {
        return transactions;
    }

    /**
     * Método que retorna el valor de la variable power_seller_status
     * @return Retorna el valor de la variable mencionada
     */
    public String getPower_seller_status() {
        if (power_seller_status!= null) {
            return power_seller_status;
        } else {
            return "";
        }
    }

    /**
     * Método que retorna el valor de la variable metrics
     * @return Retorna el valor de la variable mencionada
     */
    public Metric getMetrics() {
        return metrics;
    }

    /**
     * Método que retorna el valor de la variable protection_end_date
     * @return Retorna el valor de la variable mencionada
     */
    public String getProtection_end_date() {
        return protection_end_date;
    }
    /**
     * Método que retorna el valor de la variable real_level
     * @return Retorna el valor de la variable mencionada
     */
    public String getReal_level() {
        return real_level;
    }

    /**
     * Método que retorna el valor de la variable getLevel_id
     * @return Retorna el valor de la variable mencionada
     */
    public String getLevel_id() {
        if (level_id != null) {
            return level_id;
        } else {
            return "";
        }
    }
}
