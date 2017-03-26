package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.view.YView;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by ovidiu on 12/29/16.
 */

public class YPresenterImplTest {

    private YView view;
    private YPresenterImpl presenter;

    @Before
    public void setUp() {
        view = mock(YView.class);
        presenter = new YPresenterImpl(view);
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
}
