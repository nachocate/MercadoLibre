package com.example.mercadolibreapp.mvp.presenter;

import android.view.View;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.models.Attribute;
import com.example.mercadolibreapp.models.CustomProduct;
import com.example.mercadolibreapp.models.Picture;
import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.models.Seller;
import com.example.mercadolibreapp.models.SellerResponse;
import com.example.mercadolibreapp.mvp.interfaces.Detail;
import com.example.mercadolibreapp.mvp.model.DetailModel;

import java.util.ArrayList;


/**

 * Esta clase representa el Presentador (dentro del patron de diseño MVP) para la clase Detail.
 * Aquí se manipularán los datos obtenidos del modelo, para luego, enviarlos a la vista.
 * Además,dicha clase se corresponde con la solicitud de información refererida al detalle de
 * un producto.

 * @author  Ignacio Catena

 * @version 13/03/2021/A

 */
public class DetailPresenter implements Detail.Presenter {
    private Detail.Model model;
    private Detail.View view;

    /**
     * Constructor de la clase
     * @param view Interface de la vista de la clase Detail.
     */
    public DetailPresenter(Detail.View view){
        this.view = view;
        model = new DetailModel(this);
    }

    /**
     * Método encargado de enviar al modelo el string asociado al id del producto buscado para
     * su futura consulta a la API
     * @param productId String asociado al id del producto buscado.
     *
     */
    @Override
    public void searchProductById(String productId) {
        view.hideLinearLayoutCenter();
        view.showProgressBar();
        model.searchProductById(productId);
    }

    /**
     * Método encargado de recepcionar el error desde el modelo y enviarlo hacia la vista.
     * @param error Integer asociado al String correspondiente, almacenado en strings.xml
     *
     */
    @Override
    public void showError(Integer error) {
        view.hideProgressBar();
        view.showError(error);
    }

    /**
     * Método encargado de recepcionar una alerta proveniente desde el modelo y enviarla hacia
     * la vista.
     * @param alert Integer asociado al String correspondiente, almacenado en strings.xml
     *
     */
    @Override
    public void showAlert(Integer alert) {
        //view.showLinearLayoutCenter();
        view.hideProgressBar();
        view.showError(alert);
    }

    /**
     Método encargado de realizar una reasignación a null de los atributos instanciados y
     * utilizados en dicha clase
     */
    @Override
    public void onDestroy() {
        model.onDestroy();
    }


    /**
     * Método encargado de recepcionar una instancia de la clase Product proveniente del modelo,
     * realizar las validaciones necesarias del mismo y realizar un llamado al modelo nuevamente
     * para buscar el id del vendedor asociado al producto.
     *
     * @param product Product asociado al producto proveniente de la API.
     *
     */
    @Override
    public void onGetProductDetail(Product product){
        if(product!=null && product.getSeller_id()!=null){
            model.searchSellerById(product.getSeller_id());}
        else{
            view.hideLinearLayoutCenter();
            view.hideProgressBar();
            view.showError(R.string.ERROR_UNKNOWN);
        }
    }

    /**
     * Método encargado de recepcionar una instancia de la clase SellerResponse junto a una
     * instancia de la clase Product proveniente del modelo. Una vez obtenidas, se realizarán las
     * validaciones y preparacion de los datos necesarios para el envio de la información al método
     * showProductDetail
     *
     * @param sellerResponse Respuesta obtenida de la API asociada al un Vendedor.
     * @param product Respuesta obtenida de la API asociada al un Producto.
     */
    @Override
    public void onGetSellerDetail(SellerResponse sellerResponse,Product product) {
        /*
        De los parámetros recibidos, se obtienen aquellos atributos necesarios para
        mostrar en la vista.
         */

        if(sellerResponse!=null && sellerResponse.getSeller()!=null){
            Seller seller= sellerResponse.getSeller();
            String strConditionAndSoldQuantity=makeStringConditionAndSoldQuiantity(
                    product.getCondition(),product.getSold_quantity());
            String reputation=makeStrinPowerLevelSellerStatus(
                    seller.getSeller_reputation().getPower_seller_status());
            String sellerNickname="Vendido por: "+seller.getNickname();
            String productLink=product.getPermalink();
            String productFeatures =makeStrProductFeature(product.getAttributes());
            String productName=product.getTitle();
            String viewPager="";
            ArrayList<Picture>pictures =product.getPictures();
            String price="$ " + product.getPrice().toString();
            String originalPrice="" ;
            if (product.getOriginal_price() != null) {
                originalPrice="$"+product.getOriginal_price().toString();
            }
            String level_id=seller.getSeller_reputation().getLevel_id();
            if(seller.getSeller_reputation().getLevel_id()==null) {
                level_id="";
            }

            /*
            Con los datos obtenidos y preparados para mostrarse, se crea una instancia de la
            clase customProduct para enviarselos al método showProductDetail, encargado de
            utilizar los métodos de la vista.
             */
            CustomProduct customProduct = new CustomProduct(
                    productName,
                    productFeatures,
                    viewPager,
                    price,
                    originalPrice,
                    strConditionAndSoldQuantity,
                    sellerNickname,
                    reputation,
                    level_id,
                    pictures,
                    productLink
                    );
            showProductDetail(customProduct);
            view.showLinearLayoutCenter();
            view.hideProgressBar();
        }else{
            view.hideLinearLayoutCenter();
            view.hideProgressBar();
            view.showError(R.string.ERROR_UNKNOWN);
        }
    }

    /**
     * Método encargado de recepcionar una instancia de la clase CustomProduct, la cuál contiene la
     * información a mostrar en la vista, y realizar los llamados pertinentes a la vista para así
     * mostrar los datos al usuario. Dicho método se encarga mayormente de la interacción con la
     * vista.
     *
     * @param customProduct instancia de la clase CustomProduct con los datos a exponer en la vista.
     *
     */
    void showProductDetail(CustomProduct customProduct){
        view.setTextTvName(customProduct.getTvName());
        view.setTextTvProductFeatures(customProduct.getTvProductFeatures());
        view.setTextTvConditionAndSoldQuantity(customProduct.getTvConditionAndSoldQuiantity());
        view.setTextTvPrice(customProduct.getTvPrice());
        view.setTextTvNameSeller(customProduct.getTvSellerNickname());

        /*
        En caso de de que exista el precio original, se lo tacha (Similar a ML)
        */

        if(!customProduct.getTvOriginalPrice().equals("")) {
            view.setTextTvOriginalPrice(customProduct.getTvOriginalPrice());
            view.setStrikethroughOriginalPrice();
        }else{
            view.setVisibilityTvOriginalPrice(View.GONE);
        }

        /*
        Aquí se setea la RatingBar tanto con el ranking como el color
        */
        switch (customProduct.getTvLevelId()){
            case "1_red":
                view.setColorAndRatingRbRatingBar(R.color.colorRed,1.0f);
                break;
            case "2_orange":
                view.setColorAndRatingRbRatingBar(R.color.colorOrange,2.0f);
                break;
            case "3_yellow":
                view.setColorAndRatingRbRatingBar(R.color.colorYellow,3.0f);
                break;
            case "4_light_green":
                view.setColorAndRatingRbRatingBar(R.color.colorLightGreen,4.0f);
                break;
            case "5_green":
                view.setColorAndRatingRbRatingBar(R.color.colorGreen,5.0f);
                break;
            default:
                view.setColorAndRatingRbRatingBar(R.color.colorGrey,0.0f);
        }
        if(customProduct.getTvPowerLevelSellerStatus()!=null){
            view.setTextTvPowerLevelSellerStatus(customProduct.getTvPowerLevelSellerStatus());
        }else{
            view.setVisibilityLinealLayoutPowerLevel(View.GONE);
        }
        view.setViewPagerSetAdapter(customProduct.getPictures());
    }

    /**
     * Método encargado de recepcionar un String asociado a la reputación del vendedor y retornar
     * un valor adaptado para su utilización en la vista.
     *
     * @param reputation String asociado a la reputación de un Vendedor.
     * @return String resultante con la información adecuada para mostrar en vista
     */
    protected String makeStrinPowerLevelSellerStatus(String reputation) {
        String strReputation=null;
        if(reputation!=null){
            switch (reputation){
                case "gold":
                    strReputation="MercadoLíder Gold";
                    break;
                case "platinum":
                    strReputation="MercadoLíder Platinum";
                    break;
                case "silver":
                    strReputation="MercadoLíder Silver";
                    break;
                default:
                    strReputation=null;
            }
        }
        return strReputation;
    }

    /**
     * Método encargado de recepcionar una Lista de atributos, asociada a un producto, y convertirla
     * en un string, para así, ser utilizado en la vista.
     *
     * @param arrAtributes Array<Attribute> asociado a los atributos de un producto.
     * @return String resultante con la información adecuada para mostrar en vista
     */
    protected String makeStrProductFeature(ArrayList<Attribute> arrAtributes) {
        String strProductFeatures="";
        if ( arrAtributes!=null && arrAtributes.size() != 0 ) {
            for (int i = 0; i < arrAtributes.size(); i++) {
                strProductFeatures += arrAtributes.get(i).getName() + ": " + arrAtributes.get(i).getValue_name() + "\n";
            }
        }else{
            strProductFeatures = "Para más información, dirijirse a la publicación";
        }
        return strProductFeatures;
    }

    /**
     * Método encargado de recepcionar dos parámetros asociados a la condición del prodcuto (nuevo,
     * usado, reformado) y la cantidad de articulos vendidos por el vendedor, para luego construir y
     * retornar un string adecuado para ser mostrado en la vista.
     *
     * @param condition Condición del producto a vender.
     * @param quantity Cantidad de productos vendidos.
     * @return String resultante con la información adecuada para mostrar en vista
     */
    protected String makeStringConditionAndSoldQuiantity(String condition,Integer quantity){
        String strConditionAndSoldQuantity="";
        if((condition!=null) && (!condition.isEmpty())){
            switch (condition) {
                case "new":
                    strConditionAndSoldQuantity += "Nuevo";
                    break;
                case "used":
                    strConditionAndSoldQuantity += "Usado";
                    break;
                case "refurbished":
                    strConditionAndSoldQuantity += "Reformado";
                    break;
                default:
                    strConditionAndSoldQuantity += condition;
                    break;
            }
            if (quantity != null) {
                strConditionAndSoldQuantity += " | " + quantity.toString() + " vendidos";}
        }else{
            if (quantity != null) {
                strConditionAndSoldQuantity += quantity.toString() + " vendidos";
            }
        }
        return strConditionAndSoldQuantity;
    }

}
