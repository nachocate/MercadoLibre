package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Precios

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Prices {

   private String id;
   private ArrayList<Price> prices;
   private Presentation presentation;
   private ArrayList<PaymentMetod> payment_method_prices;

   /**
    * Método que retorna el valor de la variable id
    * @return Retorna el valor de la variable mencionada
    */
   public String getId() {
      return id;
   }

   /**
    * Método que retorna el valor de la variable prices
    * @return Retorna el valor de la variable mencionada
    */
   public ArrayList<Price> getPrices() {
      return prices;
   }

   /**
    * Método que retorna el valor de la variable presentation
    * @return Retorna el valor de la variable mencionada
    */
   public Presentation getPresentation() {
      return presentation;
   }

   /**
    * Método que retorna el valor de la variable payment_method_prices
    * @return Retorna el valor de la variable mencionada
    */
   public ArrayList<PaymentMetod> getPayment_method_prices() {
      return payment_method_prices;
   }
}
