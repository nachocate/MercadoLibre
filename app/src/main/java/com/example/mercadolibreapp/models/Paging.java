package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Paginación

 * @author : Ignacio Catena

 * @version : 13/03/2021/A

 */
public class Paging {
    private Long total;
    private Long primary_results;
    private Long offset;
    private Long limit;


    /**
     * Método que retorna el valor de la variable total
     * @return Retorna el valor de la variable mencionada
     */
    public Long getTotal() {
        return total;
    }

    /**
     * Método que retorna el valor de la variable primary_results
     * @return Retorna el valor de la variable mencionada
     */
    public Long getPrimary_results() {
        return primary_results;
    }

    /**
     * Método que retorna el valor de la variable offset
     * @return Retorna el valor de la variable mencionada
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Método que retorna el valor de la variable limit
     * @return Retorna el valor de la variable mencionada
     */
    public Long getLimit() {
        return limit;
    }
}
