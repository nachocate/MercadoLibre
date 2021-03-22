package com.example.mercadolibreapp.mvp.model;


import android.util.Log;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.api.ApiClient;
import com.example.mercadolibreapp.api.MercadoLibreApi;
import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.models.SellerResponse;
import com.example.mercadolibreapp.mvp.interfaces.Detail;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**

 * Esta clase representa el Modelo (dentro del patron de diseño MVP) para la clase Detail.
 * Aquí se obtendran los datos y se aplicarán las correspondientes reglas de negocio correspondiente
 * para luego enviarlos al presentador.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class DetailModel implements Detail.Model{
    private Detail.Presenter mPresenter;
    private MercadoLibreApi mercadoLibreApi;
    private Product product;

    /**
     * Constructor de la clase
     * @param presenter Interfaz asociada al presentador de la clase Detail
     *
     */
    public DetailModel(Detail.Presenter presenter){
        this.mPresenter=presenter;
    }

    /**
     * Método encargado de recepcionar una string que contiene el id asociado a un producto para
     * posteriormente realizar el llamado a la API de MercadoLibre. Una vez obtenida una respuesta
     * tanto favorable como no favorable, se comunicará con el presentador, para así, ejecutar
     * las acciones necesarias.
     *
     * @param id Identificador del producto.
     *
     */
    @Override
    public void searchProductById(String id) {
        mercadoLibreApi= ApiClient.getClient().create(MercadoLibreApi.class);
        Call<Product> call= mercadoLibreApi.getProductById(id);
        call.enqueue(new Callback<Product>() {
            @Override
            public void onResponse(Call<Product> call, Response<Product> response) {
                product=response.body();
                mPresenter.onGetProductDetail(response.body());
            }

            @Override
            public void onFailure(Call<Product> call, Throwable t) {
                Log.e(getClass().getName() +" method searchProductById","onFail:"+t.getMessage());
                mPresenter.showError(R.string.ERROR_ON_FAILURE);
            }
        });

    }

    /**
     * Método encargado de recepcionar un numero de tipo Long, asociado al identificador de un
     * vendedor registrado en MercadoLibre, para luego realizar el llamado a la API de MercadoLibre
     * y obtener la inforamción del mismo. Una vez obtenida una respuesta tanto favorable como no
     * favorable, se comunicará con el presentador, para así, ejecutar las acciones necesarias.
     *
     * @param id Identificador del vendedor.
     *
     */
    @Override
    public void searchSellerById(Long id) {
        mercadoLibreApi= ApiClient.getClient().create(MercadoLibreApi.class);
        Call<SellerResponse> call= mercadoLibreApi.getSellerById(id);
        call.enqueue(new Callback<SellerResponse>() {
            @Override
            public void onResponse(Call<SellerResponse> call, Response<SellerResponse> response) {
                mPresenter.onGetSellerDetail(response.body(),product);
            }

            @Override
            public void onFailure(Call<SellerResponse> call, Throwable t) {
                Log.e(getClass().getName() +" method searchSellerById","onFail:"+t.getMessage());
                mPresenter.showError(R.string.ERROR_ON_FAILURE);
            }
        });
    }

    /**
     * Método encargado de realizar una reasignación a null de los atributos instanciados y
     * utilizados en dicha clase
     */
    @Override
    public void onDestroy() {
        mercadoLibreApi=null;
        product=null;
    }
}
