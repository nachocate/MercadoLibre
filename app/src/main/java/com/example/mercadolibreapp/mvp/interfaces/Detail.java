package com.example.mercadolibreapp.mvp.interfaces;

import com.example.mercadolibreapp.models.Picture;
import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.models.SellerResponse;

import java.util.ArrayList;

/**

 * Esta interfaz pertenece esquema MVP asociado a la pantalla de el detalle un producto
 * seleccionado.
 * Aquí se declaran los métodos pertenecientes a cada uno de las capas (Modelo, Vista , Presentador)
 * para la clase Detail. Dicha interfaz contendrá los métodos con los que se relacionarán las
 * diferentes capas entre sí, generando una abstracción de la funcionalidad de los métodos de cada
 * capa hacia afuera, y brindando los canales comunicacionales entre ellas.

 * @author Ignacio Catena

 * @version  13/03/2021/A

 */
public interface Detail {
    /**
     * Interfaz asociada a la capa Vista
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuará
     * el presentador. La implementación de dichos métodos, se encuentra en la clase Detail
     */
        interface View{
            void showError (Integer error);
            void showAlert (Integer error);
            void showProgressBar();
            void hideProgressBar();
            void showLinearLayoutCenter();
            void hideLinearLayoutCenter();
            void setTextTvName(String string);
            void setTextTvProductFeatures(String string);
            void setTextTvConditionAndSoldQuantity(String string);
            void setTextTvPrice(String string);
            void setTextTvNameSeller(String string);
            void setTextTvOriginalPrice(String string);
            void setTextTvPowerLevelSellerStatus(String string);
            void setStrikethroughOriginalPrice();
            void setVisibilityTvOriginalPrice(int viewConstant);
            void setViewPagerSetAdapter(ArrayList<Picture> pictures);
            void setColorAndRatingRbRatingBar(Integer colorXml,Float rating);
            void setVisibilityLinealLayoutPowerLevel(int viewConstant);
        }

    /**
     * Interfaz asociada a la capa Presentador
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuarán las
     * capas vista y modelo. La implementación de dichos métodos, se encuentra en la clase
     * Detail.Presenter
     */
        interface Presenter{
            void showError (Integer error);
            void showAlert (Integer error);
            void onDestroy();
            void searchProductById(String productId);
            void onGetProductDetail(Product product);
            void onGetSellerDetail(SellerResponse sellerResponse,Product product);

        }
    /**
     * Interfaz asociada a la capa Modelo
     * Aquí se declaran los métodos que contendrá dicha capa, con los cuales interactuará la
     * capas presentador. La implementación de dichos métodos, se encuentra en la clase
     * Detail.Model
     */
        interface Model{
            void onDestroy();
            void searchProductById(String id);
            void searchSellerById(Long id);
        }
}
