package com.example.mercadolibreapp.adapters;


import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.models.Picture;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**

 * Esta clase representa el adaptador necesario para manipular el ViewPageAdapter que mostrará
 * las imagenes de productos.
 * Dentro del misma se encontran metodos relacionados con la maniplación de los datos para la
 * inserción en cada uno de sus elementos

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class ViewPagerAdapter extends PagerAdapter {
    private Activity activity;
    private Integer[] images;
    private ArrayList<Picture> pictures;
    private LayoutInflater inflater;
    private Context context;
    private ImageView image;


    /**
     * Constructor de la clase adaptador, la cual recibe 2 parámetos para así, guardar los valores
     * de los mismos en las variables locales.
     * @param context Contexto necesario para la iniciación de la superclase.
     * @param pictures Arreglo de tipo Picture para insertar en la ViewPager.
     *
     */
    public ViewPagerAdapter(Context context,ArrayList<Picture> pictures) {
       this.context=context;
        this.pictures=pictures;
    }

    /**
     * Método encargado de retornar la cantidad de imagenes que se encuentran presentes en la lista
     *
     */
    @Override
    public int getCount() {
        return pictures.size();
    }

    /**
     * Método encargado de retornar si la vista corresponde con el objeto
     * @param view
     * @param object
     *
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    /**
     * Metodo encargado de crear una instancia de un item, en este caso, para las imagenes de
     * productos.Aquí se realiza la carga de la imagen en la imageview via url
     * @param container conjunto de vistas
     * @param position posición relativa a insertar el elemento
     * @return objeto de tipo Object
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater)context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.item_viewpager,container,false);
        image= (ImageView)itemView.findViewById(R.id.viewPagerIv);
        DisplayMetrics dis = new DisplayMetrics();
        dis=context.getResources().getDisplayMetrics();
        Integer height = dis.heightPixels;
        Integer width = dis.widthPixels;
        image.setMinimumHeight(height);
        image.setMinimumWidth(width);
        try{
            Picasso.get().load(pictures.get(position).getUrl()).into(image);
        }
        catch (Exception t){
            Log.e(getClass().getName() +" method instantiateItem","catch ex:"+t.getMessage());
        }
        container.addView(itemView);
        return itemView;
    }

    /**
     * Metodo encargado de eliminar un elemento del tipo
     * @param container conjunto de vistas
     * @param position posición de la vista a eliminar
     * @param object vista a elimninar
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View)object);
    }


}
