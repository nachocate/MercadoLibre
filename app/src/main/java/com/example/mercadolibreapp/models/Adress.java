package com.example.mercadolibreapp.models;

/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad dirección.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */


public class Adress {
     private String state_id;
     private String state_name;
     private String city_id;
     private String city_name;

     /**
      * Método que retorna el valor de la variable state_id
      * @return Retorna el valor de la variable mencionada
      */
     public String getState_id() {
          return state_id;
     }
     /**
      * Método que retorna el valor de la variable state_name
      * @return Retorna el valor de la variable mencionada
      */
     public String getState_name() {
          return state_name;
     }
     /**
      * Método que retorna el valor de la variable city_id
      * @return Retorna el valor de la variable mencionada
      */
     public String getCity_id() {
          return city_id;
     }

     /**
      * Método que retorna el valor de la variable city_name
      * @return Retorna el valor de la variable mencionada
      */
     public String getCity_name() {
          return city_name;
     }
}
