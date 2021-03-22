package com.example.mercadolibreapp.models;


/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Entregas

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Installment {
   private  Integer quantity;
   private Float amount;
   private Float rate;
   private String currency_id;

   /**
    * Método que retorna el valor de la variable quantity
    * @return Retorna el valor de la variable mencionada
    */
   public Integer getQuantity() {
      return quantity;
   }
   /**
    * Método que retorna el valor de la variable amount
    * @return Retorna el valor de la variable mencionada
    */
   public Float getAmount() {
      return amount;
   }
   /**
    * Método que retorna el valor de la variable rate
    * @return Retorna el valor de la variable mencionada
    */
   public Float getRate() {
      return rate;
   }
   /**
    * Método que retorna el valor de la variable currency_id
    * @return Retorna el valor de la variable mencionada
    */
   public String getCurrency_id() {
      return currency_id;
   }
}
