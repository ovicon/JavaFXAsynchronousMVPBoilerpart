package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.NavigationController;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.presenter.XPresenterImplTest;

import java.net.URL;
import java.util.ResourceBundle;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Created by ovidiu on 2/24/17.
 */
public class XViewImplTest {

    private XViewImpl view;

    @Before
    public void setUp() {
        view = mock(XViewImpl.class);
    }

    @After
    public void tearDown() {
        view = null;
    }

    @Test
    public void testRequestAction1() {
        doNothing().when(view).requestAction1();
        view.requestAction1();
    }

    @Test
    public void testPostResult1() {
        doNothing().when(view).postResult1(anyString());
        view.postResult1(anyString());
    }

    @Test
    public void testRequestAction2() {
        doNothing().when(view).requestAction2();
        view.requestAction2();
    }

    @Test
    public void testPostResult2() {
        doNothing().when(view).postResult2(anyString());
        view.postResult2(anyString());
    }

    @Test
    public void testRequestAction3() {
        doNothing().when(view).requestAction3();
        view.requestAction3();
    }

    @Test
    public void testPostResult3() {
        doNothing().when(view).postResult3(anyString());
        view.postResult3(anyString());
    }

    @Test
    public void testRequestFeatureY() {
        doNothing().when(view).requestFeatureY();
        view.requestFeatureY();
    }

    @Test
    public void testSetNavigationController() {
        doNothing().when(view).setNavigationController(any(NavigationController.class));
        view.setNavigationController(any(NavigationController.class));
    }
}
