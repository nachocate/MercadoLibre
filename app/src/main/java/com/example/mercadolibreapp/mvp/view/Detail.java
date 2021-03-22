package com.example.mercadolibreapp.mvp.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.adapters.ViewPagerAdapter;
import com.example.mercadolibreapp.models.Picture;
import com.example.mercadolibreapp.mvp.presenter.DetailPresenter;

import java.util.ArrayList;

/**

 * Esta clase representa la vista (dentro del patron de diseño MVP) para la clase Detail.
 * Aquí se declaran e inicializan los atributos y funciones a utilizar en la vista.
 * Dicha clase, posee lógica escasa o nula, dado que sus atributos son utilizados desde
 * el presentador por medio de los métodos aquí presentes
 * Dicha clase se corresponde con la presentación ante el usuario de la barra de busqueda del
 * producto.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class Detail extends Fragment implements com.example.mercadolibreapp.mvp.interfaces.Detail.View {
    private View view;
    private String productId;
    private TextView tvPowerLevelSellerStatus;
    private TextView tvName;
    private TextView tvNameSeller;
    private TextView tvProductFeatures;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;
    private TextView tvPrice;
    private TextView tvOriginalPrice;
    private TextView tvConditionAndSoldQuiantity;
    private RatingBar rbRatingBar;
    private LinearLayout linearLayout;
    private ProgressBar pbLoading;
    private LinearLayout llCenter;
    private com.example.mercadolibreapp.mvp.interfaces.Detail.Presenter mPresenter;
    private Button bInfrormation;
    private String urlProductLink;
    private LayerDrawable stars;


    /**
     * Constructor de la clase Detail, el cual se encuenta vacío por defecto.
     */
    public Detail() {
    }

    /**
     * Método encargado de la creación de una nueva instancia del fragmento, junto con el pasaje de
     * argumentos.
     * @param productId Itentificador del producto a buscar
     * @return Retorna el fragmento de tipo Detail
     */
    public static Detail newInstance(String productId){
        Detail fragment = new Detail();
        Bundle args = new Bundle();
        args.putString("ProductId",  productId);
        fragment.setArguments(args);
        return fragment;
    }

    /**
     * Método encargado de ejecutarse al crearse una instancia de tipo Detail. En el mismo se
     * obtienen los argumentos pasados en caso de que existan.
     *
     * @param savedInstanceState Contiene la instancia del fragmento
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            productId = (String) getArguments().getString("ProductId");
        }
    }

    /**
     * Método encargado de la creación de la vista asociada al fragmento.
     * Dicha función se encarga de conectar los atributos declarados con su correspondiente xml.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return Retorna el valor de la vista
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_detail, container, false);
        getActivity().setTitle(R.string.DETAIL_TITLE);
         urlProductLink = getString(R.string.URL_MERCADO_LIBRE);
         mPresenter = new DetailPresenter(this);
         llCenter = (LinearLayout) view.findViewById(R.id.llCenterDetail);
         pbLoading = (ProgressBar) view.findViewById(R.id.pbProgressBarDetail);
         mPresenter.searchProductById(productId);
         viewPager = (ViewPager) view.findViewById(R.id.viewPager);
         tvName = (TextView) view.findViewById(R.id.tvProductNameDetail);
         tvProductFeatures = (TextView) view.findViewById(R.id.tvProductFeatures);
         tvPrice = (TextView) view.findViewById(R.id.tvPriceDetail);
         tvOriginalPrice = (TextView) view.findViewById(R.id.tvOriginalPriceDetail);
         tvConditionAndSoldQuiantity = (TextView) view.findViewById(R.id.tvConditionAndSoldQuiantityDetail);
         tvNameSeller = (TextView) view.findViewById(R.id.tvNameSellerDetail);
         tvPowerLevelSellerStatus = (TextView) view.findViewById(R.id.tvPowerSellerStatusDetail);
         linearLayout = (LinearLayout) view.findViewById(R.id.llPowerLevelSellerStatusDetail);
         rbRatingBar = (RatingBar) view.findViewById(R.id.rbRatingBarDetail);
         bInfrormation = (Button) view.findViewById(R.id.bInformationDetail);
         stars = (LayerDrawable) rbRatingBar.getProgressDrawable();
         bInfrormation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(urlProductLink));
                    startActivity(i);
                }
            });
        return view;
    }

    /**
     * Método encargado de mostrar al usuario algún error proveniente tanto del presentador como del
     * modelo
     * @param error Valor entero asociado al error
     */
    @Override
    public void showError(Integer error) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
        alertDialog.setTitle(getString(R.string.ERROR_TITLE));
        alertDialog.setMessage(getString(error));
        alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                getActivity().onBackPressed();
            }
        });
        alertDialog.show();
    }


    /**
     * Método encargado de mostrar al usuario algúna advertencia proveniente tanto en el presentador
     * como del modelo
     * @param alert Valor entero asociado al error
     */
    @Override
    public void showAlert(Integer alert) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getContext());
        alertDialog.setTitle(getString(R.string.ALERT_TITLE));
        alertDialog.setMessage(getString(alert));
        alertDialog.setPositiveButton("Aceptar",null);
        alertDialog.show();
    }

    /**
     * Método encargado de mostrar el progress bar mientras ocurren las llamadas a la API.
     */
    @Override
    public void showProgressBar() {
        pbLoading.setVisibility(View.VISIBLE);
    }

    /**
     * Método encargado de ocultar el progress bar una vez finalizada la llamada a la API,
     * independiente del resultado de la misma
     */
    @Override
    public void hideProgressBar() {
        pbLoading.setVisibility(View.GONE);
    }

    /**
     * Método encargado de mostrar el linear layout principal una vez que las peticiones a la API
     * sean existosas.
     */
    @Override
    public void showLinearLayoutCenter() {
        llCenter.setVisibility(View.VISIBLE);
    }

    /**
     * Método encargado de ocultar el linear layout principal en caso de que ocurra algún error
     * en las peticiones realizadas a la API
     */
    @Override
    public void hideLinearLayoutCenter() {
        llCenter.setVisibility(View.GONE);
    }

    /**
     * Método encargado de asignarle un valor al atributo TextView asociado al nombre del producto
     * @param string nombre del producto
     */
    @Override
    public void setTextTvName(String string){ tvName.setText(string); }

    /**
     * Método encargado de asignarle un valor al atributo TextView asociado a las características
     * del producto
     * @param string características del prodcuto
     */
    @Override
    public void setTextTvProductFeatures(String string){ tvProductFeatures.setText(string);}

    /**
     * Método encargado de asignarle un valor al atributo TextView asociado a la condición del
     * producto(nuevo,usado,etc) junto a la cantidad vendida del mismo
     * @param string con los valores de condición y cantidad vendida
     */
    @Override
    public void setTextTvConditionAndSoldQuantity(String string){
        tvConditionAndSoldQuiantity.setText(string);
    }

    /**
     * Método encargado de asignarle un valor al atributo TextView asociado al precio del producto
     * @param string precio del producto
     */
    @Override
    public void setTextTvPrice(String string){tvPrice.setText(string);}

    /**
     * Método encargado de asignarle un valor al atributo TextView asociado al nombre del vendedor
     * @param string nombre del vendedor
     */
    @Override
    public void setTextTvNameSeller(String string){tvNameSeller.setText(string);}

    /**
     * Método encargado de asignarle un valor al atributo TextView asociado al precio original del
     * producto
     * @param string precio original del producto
     */
    @Override
    public void setTextTvOriginalPrice(String string){ tvOriginalPrice.setText(string); }

    /**
     * Método encargado de asignarle un valor al atributo TextView asociado al status del vendedor
     * (MercadoLider GOLD, PLATINUM, SILVER)
     * @param string nombre del producto
     */
    @Override
    public void setTextTvPowerLevelSellerStatus(String string){
        tvPowerLevelSellerStatus.setText(string);
    }

    /**
     * Método encargado de tachar el texto mostrado por el TextView asociado al precio original
     * del producto
     */
    @Override
    public void setStrikethroughOriginalPrice(){
        tvOriginalPrice.setPaintFlags(tvOriginalPrice.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
    }

    /**
     * Método encargado de cambiar la visibilidad del TextView asociado al precio original del
     * producto
     * @param viewConstant entero asociado a los tipos de visibilización declarados en la clase
     * View
     */
    @Override
    public void setVisibilityTvOriginalPrice(int viewConstant){
        tvOriginalPrice.setVisibility(viewConstant);
    }

    /**
     * Método encargado de crear el adaptador para el ViewPageAdapter, el cuál mostrará las imagenes
     * del producto.
     * @param pictures Lista de instancias de la clase Picture, asociadas a las imagenes del producto
     */
    @Override
    public void setViewPagerSetAdapter(ArrayList<Picture> pictures){
        viewPagerAdapter = new ViewPagerAdapter(getContext(),pictures);
        viewPager.setAdapter(viewPagerAdapter);
    }

    /**
     * Método encargado de asignarle el color y el rating a la barra de rating con estrellas.
     * @param colorXml entero asociado al color declarado en colors.xml
     * @param rating rating asociado al vendedor (valores del 0.0f al 5.0f con incremento unitario)
     */
    @Override
    public void setColorAndRatingRbRatingBar(Integer colorXml,Float rating){
        Integer color=ResourcesCompat.getColor(getResources(), colorXml, null);
        rbRatingBar.setRating(rating);
        stars.getDrawable(2).setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        rbRatingBar.setIsIndicator(true);
    }


    /**
     * Método encargado de cambiar la visibilidad del LinearLayout que contiene al textView asociado
     * al status del vendedor (MercadoLider GOLD, PLATINUM, SILVER)
     * @param viewConstant entero asociado a los tipos de visibilización declarados en la clase
     * View
     */
    @Override
    public void setVisibilityLinealLayoutPowerLevel(int viewConstant){
        linearLayout.setVisibility(viewConstant);
    }

    /**
     * Método sobrecargado para destruir/limpiar las dependencias asociadas a dicha clase, una vez
     * que el fragmento se destruya
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (view.getParent() != null) {
            ((ViewGroup)view.getParent()).removeView(view);
        }
        mPresenter.onDestroy();
    }

}

