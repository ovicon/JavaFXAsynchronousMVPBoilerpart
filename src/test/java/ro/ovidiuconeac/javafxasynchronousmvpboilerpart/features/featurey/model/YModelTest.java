package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 12/29/16.
 */

public class YModelTest {

    private YModel model;

    @Before
    public void setUp() {
        model = new YModel();
    }

    @After
    public void tearDown() {
        model = null;
    }

    @Test
    public void testRequestAction1() {
        YResponse response = model.requestAction1();
        assertNotNull(response);
        assertNotNull(response.getResult());
    }

    @Test
    public void testRequestAction2() {
        YResponse response = model.requestAction2();
        assertNotNull(response);
        assertNotNull(response.getResult());
    }
}
