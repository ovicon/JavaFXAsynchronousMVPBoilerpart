package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.view.XView;

import static org.mockito.Mockito.*;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XPresenterImplTest {

    private XView view;
    private XPresenterImpl presenter;

    @Before
    public void setUp() {
        view = mock(XView.class);
        presenter = new XPresenterImpl(view);
    }

    @After
    public void tearDown() {
        view = null;
        presenter = null;
    }

    @Test
    public void testRequestAction1() {
        presenter.requestAction1();
        verify(view, times(1)).postResult1(anyString());
    }

    @Test
    public void testRequestAction2() {
        presenter.requestAction2();
        verify(view, times(1)).postResult2(anyString());
    }

    @Test
    public void testRequestAction3() {
        presenter.requestAction3();
        verify(view, times(1)).postResult3(anyString());
    }
}
