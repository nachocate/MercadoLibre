package com.example.mercadolibreapp.mvp.model;

import android.util.Log;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.api.ApiClient;
import com.example.mercadolibreapp.api.MercadoLibreApi;
import com.example.mercadolibreapp.models.ProductResponse;
import com.example.mercadolibreapp.mvp.interfaces.ItemList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**

 * Esta clase representa el Modelo dentro del patron de diseño MVP para la clase ItemListModel.
 * Aquí se obtendran los datos y se aplicarán las reglas de negocio correspondiente para luego
 * enviarlos al presentador.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class ItemListModel implements ItemList.Model  {
    private ItemList.Presenter mPresenter;
    private MercadoLibreApi mercadoLibreApi;

    /**
     * Constructor de la clase
     * @param presenter Interface del presentador interactuar con el presentador asociado.
     */
    public ItemListModel(ItemList.Presenter presenter){
        this.mPresenter=presenter;
    }

    /**
     * Método encargado de buscar un produto en base a su nombre / descripción solicitados.
     * Dicho método utiliza la API de Retrofit para solicitar dicha información. En caso de
     * respuesta favorable o desfavorable, el método se comunicará con el presentador para enviar
     * la información correspondiente.
     * @param item Nombre / descripción del prodcuto buscado
     *
     */
    @Override
    public void searchItemData(String item) {
        mercadoLibreApi=ApiClient.getClient().create(MercadoLibreApi.class);
        Call<ProductResponse> call= mercadoLibreApi.getProductList(item);
        call.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                mPresenter.onGetListProduct(response.body());
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                Log.e(getClass().getName() +" method searchItemData","onFail:"+t.getMessage());
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
    }

}
