package com.example.mercadolibreapp;

import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mercadolibreapp.mvp.view.SearchBar;

/**

 * Esta clase representa la actividad principal la cuál será marco de todas las pantallas que posea
 * la aplicación. La misma, se enfocará en inicializar el fragmento principal para así dar inicio
 * a la app.

 * @author Ignacio Catena

 * @version 13/03/2021/A

 */
public class MainActivity extends AppCompatActivity {
    private FragmentTransaction transaction;
    private SearchBar searchBar;
    private Boolean landscape;
    private static Integer REQUEST_CODE_INTERNET=1;

    /**
     * Metodo encargado de inicializar las variables. El mismo responde al crearse una instancia de
     * esta clase. Aquí se encontrará la primera transacción asociada al primer fragmento
     * @param savedInstanceState instancia asociada al estado de la actividad
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchBar= new SearchBar();
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,searchBar).commit();
        }
    }
}

