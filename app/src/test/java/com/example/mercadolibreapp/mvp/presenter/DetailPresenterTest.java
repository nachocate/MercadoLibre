package com.example.mercadolibreapp.mvp.presenter;

import com.example.mercadolibreapp.R;
import com.example.mercadolibreapp.models.Attribute;
import com.example.mercadolibreapp.models.Product;
import com.example.mercadolibreapp.models.SellerResponse;
import com.example.mercadolibreapp.mvp.interfaces.Detail;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.mockito.Mockito.verify;

/**

 * Esta clase representa el test unitario para la clase DetailPresenter.
 * Aquí se realizaron los test necesarios para comprobar las funcionalidades del presentador junto a
 * su interacción, tanto con la vista como con el modelo.

 * @author  Ignacio Catena

 * @version  13/03/2021/A

 */
@RunWith(MockitoJUnitRunner.class)
public class DetailPresenterTest extends TestCase {
    private DetailPresenter presenter;

    @Mock
    private Detail.View view;

    @Mock
    private Product product;


    /**
     * Se hace la preparación previa de las instancias a utilizar en los test.
     * @throws Exception
     */
    @Before
    public void setUp() {
        presenter= new DetailPresenter(view);
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función onGetProductDetail
     * con una una instancia nula, envía una advertencia tipo Error a la vista con el
     * mensaje correspondiente
     */
    @Test
    public void onGetProductDetail_shouldNotSuccesWhithNull(){
        presenter.onGetProductDetail(null);
        verify(view).showError(R.string.ERROR_UNKNOWN);
    }


    /**
     * Este test comprueba que una vez que el presenter llama a la función onGetProductDetail
     * con un atrubuto (seller_id=null), envía una advertencia tipo Error a la vista con el
     * mensaje correspondiente
     */
    @Test
    public void onGetProductDetail_shouldNotSuccesWhithSellerIdNull(){
        presenter.onGetProductDetail(new Product());
        verify(view).showError(R.string.ERROR_UNKNOWN);
    }


    /**
     * Este test comprueba que una vez que el presenter llama a la función onGetSellerDetail
     * con un atrubuto (SellerResponse=null), envía una advertencia tipo Error a la vista con el
     * mensaje correspondiente. Recordemos que el parámetro product no puede ser nulo.
     */
    @Test
    public void onGetSellerDetail_shouldNotSuccesWhithSellerResponseNull(){
        presenter.onGetSellerDetail(null,product);
        verify(view).showError(R.string.ERROR_UNKNOWN);
    }


    /**
     * Este test comprueba que una vez que el presenter llama a la función onGetSellerDetail
     * con un atrubuto (SellerResponse=vacío), envía una advertencia tipo Error a la vista con el
     * mensaje correspondiente. Recordemos que el parámetro product no puede ser nulo.
     */
    @Test
    public void onGetSellerDetail_shouldNotSuccesWhithGetSellerNull(){
        presenter.onGetSellerDetail(new SellerResponse(),product);
        verify(view).showError(R.string.ERROR_UNKNOWN);
    }



    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStrProductFeature
     * con un parámetro (ArrayList<Attribute> vacio), esta retorna un string predefinido en dicha función.
     */
    @Test
    public void makeStrProductFeature_shouldNotSuccesWithArrayEmpty(){
        assertEquals(presenter.makeStrProductFeature(new ArrayList<Attribute>()),"Para más información, dirijirse a la publicación");
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStrProductFeature
     * con un parámetro (ArrayList<Attribute>=null), esta retorna un string predefinido en dicha función.
     */
    @Test
    public void makeStrProductFeature_shouldNotSuccesWithArrayNull(){
        ArrayList<Attribute>arr=null;
        assertEquals(presenter.makeStrProductFeature(arr),"Para más información, dirijirse a la publicación");
    }


    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStringConditionAndSoldQuiantity
     * con  parámetros quantity=null y condition=null, esta retorna un string vacío.
     */
    @Test
    public void makeStringConditionAndSoldQuiantity_shouldSuccesParamsNull(){
        assertEquals(presenter.makeStringConditionAndSoldQuiantity(null,null),"");
    }
    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStringConditionAndSoldQuiantity
     * con  parámetros quantity=0 y condition=null, esta retorna un string con solo elementos vendidos.
     */
    @Test
    public void makeStringConditionAndSoldQuiantity_shouldSuccesWithConditionNull(){
        assertEquals(presenter.makeStringConditionAndSoldQuiantity(null,0),"0 vendidos");
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStringConditionAndSoldQuiantity
     * con  parámetros quantity=null y condition="", esta retorna un string vacío.
     */
    @Test
    public void makeStringConditionAndSoldQuiantity_shouldSuccesWithQuantityNull(){
        ArrayList<Attribute>arr=null;
        assertEquals(presenter.makeStringConditionAndSoldQuiantity("",null),"");
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStringConditionAndSoldQuiantity
     * con  parámetros quantity=10 y condition="new", esta retorna un con los datos requeridos.
     */
    @Test
    public void makeStringConditionAndSoldQuiantity_shouldSucces(){
        assertEquals(presenter.makeStringConditionAndSoldQuiantity("new",10),"Nuevo | 10 vendidos");
    }


    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStrinPowerLevelSellerStatus
     * con el parámetro reputation=null, esta retorna un string nulo.
     */
    @Test
    public void makeStrinPowerLevelSellerStatus_shouldSuccesWithNullParameter(){
        assertEquals(presenter.makeStrinPowerLevelSellerStatus(null),null);
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStrinPowerLevelSellerStatus
     * con el parámetro reputation="", esta retorna un string nulo.
     */
    @Test
    public void makeStrinPowerLevelSellerStatus_shouldSuccesWithEmptyParameter(){
        assertEquals(presenter.makeStrinPowerLevelSellerStatus(""),null);
    }

    /**
     * Este test comprueba que una vez que el presenter llama a la función makeStrinPowerLevelSellerStatus
     * con el parámetro reputation="gold", esta retorna un string "MercadoLíder Gold".
     */
    @Test
    public void makeStrinPowerLevelSellerStatus_shouldSucces(){
        assertEquals(presenter.makeStrinPowerLevelSellerStatus("gold"),"MercadoLíder Gold");
    }

}