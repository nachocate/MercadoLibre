package com.example.mercadolibreapp.mvp.presenter;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.mvp.interfaces.SearchBar;
import com.example.mercadolibreapp.mvp.model.SearchBarModel;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class SearchBarPresenterTest extends TestCase {

    @Mock
    private  SearchBar.View view;
    private SearchBar.Model model;
    private SearchBarPresenter presenter;

    @Before
    public void setUp() throws Exception{
        presenter=new SearchBarPresenter(view);
        model=new SearchBarModel(presenter);
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función searchProduct
     * con un string válido.
     */

    @Test
    public void searchProduct_shouldSuccesWithStringNotEmpty()throws Exception{
        presenter.searchProduct("zapatilla");
        verify(view).changeFragmentToItemList("zapatilla");
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función searchProduct
     * con un string vacío. Retorna una alerta hacia la vista, con un mensaje acorde al mismo.
     */
    @Test
    public void searchProduct_shouldNotSuccesWithEmptyParameter()throws Exception{
        presenter.searchProduct("");
        verify(view).showAlert(R.string.ALERT_SEARCH_FIELD_EMPTY);

    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función searchProduct
     * con un string nulo. Retorna error hacia la vista, con un mensaje acorde al mismo.
     */
    @Test
    public void searchProduct_shouldNotSuccesWithNullParameter()throws Exception{
        presenter.searchProduct(null);
        verify(view).showError(R.string.ERROR_UNKNOWN);
    }
}