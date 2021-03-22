package com.example.mercadolibreapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**

 * Esta clase modela el cliente para la api basado en retrofit. En dicha clase se inicializan las
 * variables necesarias para ser utilizada desde los modelos

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class ApiClient {
    public static final String BASE_URL= "https://api.mercadolibre.com/";
    public static Retrofit retrofit= null;


    /**
     * Función que retorna el atributo asociado a retrofit, previamente inicializado todos sus
     * parámetros, para su utilización en llamadas a la API de MercadoLibre
     * @return Retorna el atributo de tipo Retrofit ya inicializado.
     */
    public static Retrofit getClient() {
        if(retrofit== null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
