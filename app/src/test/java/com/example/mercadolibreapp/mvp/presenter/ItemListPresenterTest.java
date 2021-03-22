package com.example.mercadolibreapp.mvp.presenter;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.models.ProductResponse;
import com.example.mercadolibreapp.mvp.interfaces.ItemList;
import com.example.mercadolibreapp.mvp.model.ItemListModel;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;




/**

 * Esta clase representa el test unitario para la clase ItemListPresenter.
 * Aquí se realizaron los test necesarios para comprobar las funcionalidades del presentador junto a
 * su interacción, tanto con la vista como con el modelo.

 * @author Ignacio Catena

 * @version  13/03/2021/A

 */
@RunWith(MockitoJUnitRunner.class)
public class ItemListPresenterTest extends TestCase {
    private ItemListPresenter presenter;

    @Mock
    private ItemList.View view;

    @Mock
    private Product product;

    @Mock
    private ProductResponse productResponse;
    @Mock
    private ItemList.Model model;

    /**
     * Se hace la preparación previa de las instancias a utilizar en los test.
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception{
        presenter= new ItemListPresenter(view);
        model=new ItemListModel(presenter);
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función onGetListProduct
     * con una una instancia de productResponse la cual contiene una lista vacía, envía una
     * advertencia tipo Alerta a la vista con el mensaje correspondiente
     */
    @Test
    public void onGetListProduct_shouldNotSuccesWhithEmptyArray(){
        presenter.onGetListProduct(productResponse);
        verify(view).showAlert(R.string.ALERT_PRODUCT_LIST_NOT_FOUND);
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función onGetListProduct
     * con una una instancia de productResponse la cual contiene una lista nula, envía una
     * advertencia tipo error a la vista con el mensaje correspondiente
     */
    @Test
    public void onGetListProduct_shouldNotSuccesWhithResultsEqualNull(){
        productResponse.setResults(null);
        presenter.onGetListProduct(productResponse);
        verify(view).showAlert(R.string.ALERT_PRODUCT_LIST_NOT_FOUND);
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función findProduct
     * con una numero entero negativo, el resultado esperado deberá ser mostrar un error al usuario
     */
    @Test
    public void findProduct_shouldNotSuccesWhithFindProducNegative()throws Exception{
        presenter.findProduct(-1);
        verify(view).showError(R.string.ERROR_UNKNOWN);
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función findProduct
     * con una numero entero negativo, el resultado esperado deberá ser mostrar un error al usuario
     */
    @Test
    public void findProduct_shouldNotSuccesWhithFindProducNull()throws Exception{
        presenter.findProduct(null);
        verify(view).showError(R.string.ERROR_UNKNOWN);
    }
    /**
     * Este test comprueba que una vez que el presenter llama a la función findProduct
     * con una numero entero valido, el resultado esperado deberá ser mostrar un error al usuario
     */
    @Test
    public void findProduct_shouldSuccesWhithFindProduct()throws Exception{
        presenter.addProductToArrayProducts(product);
        presenter.addProductToArrayProducts(product);
        presenter.findProduct(0);
        verify(view).changeFragmentToProductDetail(presenter.getProductToArrayProducts(0).getId());
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función findProduct
     * con una numero entero que excede el tamaño del arreglo.
     * El resultado esperado deberiá ser mostrar un error al usuario
     */
    @Test
    public void findProduct_shouldNotSuccesWhithFindProductLimitExceeded()throws Exception{
        //el presenter ya posee 2 elementos provenientes del test anterior
        presenter.findProduct(2);
        verify(view).showError(R.string.ERROR_UNKNOWN);;
    }

}