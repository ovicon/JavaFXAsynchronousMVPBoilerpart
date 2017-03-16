package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.NavigationController;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.view.XViewImpl;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Created by ovidiu on 2/24/17.
 */
public class YViewImplTest {

    private YViewImpl view;

    @Before
    public void setUp() {
        view = mock(YViewImpl.class);
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
    public void testRequestFeatureY() {
        doNothing().when(view).requestFeatureX();
        view.requestFeatureX();
    }

    @Test
    public void testSetNavigationController() {
        doNothing().when(view).setNavigationController(any(NavigationController.class));
        view.setNavigationController(any(NavigationController.class));
    }
}
