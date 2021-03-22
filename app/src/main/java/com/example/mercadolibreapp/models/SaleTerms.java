package com.example.mercadolibreapp.models;

import java.util.ArrayList;
/**

 * Esta clase se encuentra asociada al modelo presentado por la API correpondiente a MercadoLibre.
 * Dicha, modela la entidad Terminos de Venta

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class SaleTerms {
   private String id;
   private String name;
   private String value_id;
   private String value_name;
   private ValueStruct value_struct;
   private ArrayList<Value>values;

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

   /**
    * Método que retorna el valor de la variable value_id
    * @return Retorna el valor de la variable mencionada
    */
   public String getValue_id() {
      return value_id;
   }

   /**
    * Método que retorna el valor de la variable value_name
    * @return Retorna el valor de la variable mencionada
    */
   public String getValue_name() {
      return value_name;
   }

   /**
    * Método que retorna el valor de la variable value_struct
    * @return Retorna el valor de la variable mencionada
    */
   public ValueStruct getValue_struct() {
      return value_struct;
   }

   /**
    * Método que retorna el valor de la variable values
    * @return Retorna el valor de la variable mencionada
    */
   public ArrayList<Value> getValues() {
      return values;
   }
}
