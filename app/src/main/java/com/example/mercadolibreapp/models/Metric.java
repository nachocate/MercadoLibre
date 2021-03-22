package com.example.mercadolibreapp.models;

/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Metricas

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Metric {
       private Claim claims;
       private DelayedHandlingTime delayed_handling_time;
       private Sale sales;
       private Cancellation cancellation;


       /**
        * Método que retorna el valor de la variable claims
        * @return Retorna el valor de la variable mencionada
        */
       public Claim getClaims() {
              return claims;
       }

       /**
        * Método que retorna el valor de la variable delayed_handling_time
        * @return Retorna el valor de la variable mencionada
        */
       public DelayedHandlingTime getDelayed_handling_time() {
              return delayed_handling_time;
       }

       /**
        * Método que retorna el valor de la variable sales
        * @return Retorna el valor de la variable mencionada
        */
       public Sale getSales() {
              return sales;
       }

       /**
        * Método que retorna el valor de la variable cancellation
        * @return Retorna el valor de la variable mencionada
        */
       public Cancellation getCancellation() {
              return cancellation;
       }
}
