package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.presenter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

/**
 * Created by ovidiu on 12/29/16.
 */

public class YPresenterImplTest {

    private YPresenterImpl presenter;

    @Before
    public void setUp() {
        presenter = mock(YPresenterImpl.class);
    }

    @After
    public void tearDown() {
        presenter = null;
    }

    @Test
    public void testRequestAction1() {
        doNothing().when(presenter).requestAction1();
        presenter.requestAction1();
    }

    @Test
    public void testRequestAction2() {
        doNothing().when(presenter).requestAction2();
        presenter.requestAction2();
    }
}
