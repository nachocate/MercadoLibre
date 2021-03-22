package com.example.mercadolibreapp.models;

/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Exclusión

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Excluded {
     private Float real_rate;
     private Float real_value;

     /**
      * Método que retorna el valor de la variable real_rate
      * @return Retorna el valor de la variable mencionada
      */
     public Float getReal_rate() {
          return real_rate;
     }

     /**
      * Método que retorna el valor de la variable real_value
      * @return Retorna el valor de la variable mencionada
      */
     public Float getReal_value() {
          return real_value;
     }
}
