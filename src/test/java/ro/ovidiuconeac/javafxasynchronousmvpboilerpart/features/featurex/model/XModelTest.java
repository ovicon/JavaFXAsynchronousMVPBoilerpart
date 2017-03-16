package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XModelTest {

    private XModel model;

    @Before
    public void setUp() {
        model = new XModel();
    }

    @After
    public void tearDown() {
        model = null;
    }

    @Test
    public void testRequestAction1() {
        XResponse response = model.requestAction1();
        assertNotNull(response);
        assertNotNull(response.getResult());
    }

    @Test
    public void testRequestAction2() {
        XResponse response = model.requestAction2();
        assertNotNull(response);
        assertNotNull(response.getResult());
    }

    @Test
    public void testRequestAction3() {
        XResponse response = model.requestAction3();
        assertNotNull(response);
        assertNotNull(response.getResult());
    }
}
