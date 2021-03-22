package com.example.mercadolibreapp.api;

import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.models.ProductResponse;
import com.example.mercadolibreapp.models.SellerResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
/**

 * Esta interfaz declara los métodos que serán implementados para interactuar con la API de
 * MercadoLibre.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public interface MercadoLibreApi {

    /*
    Método encargado de buscar productos que macheen con el nombre/descripción solicitada
     */
    @GET("sites/MLA/search")
    Call<ProductResponse> getProductList(@Query("q") String data);

    /*
    Método encargado de obtener la información de un producto dado su id
     */
    @GET("items/{id}")
    Call<Product> getProductById(@Path("id") String id);

    /*
    Metodo encargado de obtener la información de un vendedor dado su id
     */
    @GET("sites/MLA/search")
    Call<SellerResponse> getSellerById(@Query("seller_id") Long data);
}

