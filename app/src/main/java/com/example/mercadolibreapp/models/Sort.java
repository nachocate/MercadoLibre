package com.example.mercadolibreapp.models;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Ordenmiento

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Sort {
     private String id;
     private String name;

     /**
      * Método que retorna el valor de la variable id
      * @return Retorna el valor de la variable mencionada
      */
     public String getId() {
          return id;
     }

     /**
      * Método que retorna el valor de la variable name
      * @return Retorna el valor de la variable mencionada
      */
     public String getName() {
          return name;
     }
}
