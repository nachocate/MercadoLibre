package com.example.mercadolibreapp.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.models.Product;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;




/**

 * Esta clase representa el adaptador necesario para manipular la ListView. Dentro del misma
 * se encontran metodos relacionados con la maniplación de los datos para la inserción en cada uno
 * de sus elementos

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class ProductAdapter extends ArrayAdapter<Product> {
    private Context context;
    private  ArrayList<Product> values;

    /*
    * Clase creada de forma estática para mejorár la performance de la listView. La misma,
    * contiene los elementos instanciados en el xml correspondiente.
    * */
    static class ViewHolder{
       private TextView tvPrice;
       private TextView tvName;
       private ImageView ivImage;

       //Constructor de la clase ViewHolder
       public ViewHolder(View view){
           tvPrice = (TextView) view.findViewById(R.id.tvItemProductPrice);
           tvName = (TextView) view.findViewById(R.id.tvItemProductName);
           ivImage=(ImageView) view.findViewById(R.id.ivImage);
       }

    }

    /**
     * Constructor de la clase adaptador, la cual recibe 2 parámetos para así, guardar los valores
     * de los mismos en las variables locales.
     * @param context Contexto necesario para la iniciación de la superclase.
     * @param values Arreglo de tipo Product para insertar en la listview.
     *
     */
    public ProductAdapter  (Context context, ArrayList<Product> values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }


    /**
     * Método encargado de la creación de cada uno de los elementos dentro de la ListView.
     * @param position Posición correspondiente a la fila de la ListView.
     * @param convertView Vista correspondiente a la ListView.
     * @param parent Conjunto de vistas que ofician de padre.
     * @return Retona la vista de cada fila correspondiente a la ListView
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        View view=convertView;
        if(view==null){
            LayoutInflater inflate=LayoutInflater.from(context);
            view= inflate.inflate(R.layout.item_product, parent, false);
            viewHolder=new ViewHolder(view);
            view.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder)view.getTag();
        }
        try {
            Picasso.get().load(values.get(position).getThumbnail()).into(viewHolder.ivImage);
        }catch (Exception e){
            Log.e(getClass().getName() +" method getView","catchExeption: "+e.getMessage());
        }
        viewHolder.tvPrice.setText("$"+values.get(position).getPrice().toString());
        viewHolder.tvName.setText(values.get(position).getTitle());
        return view;
    }
}


