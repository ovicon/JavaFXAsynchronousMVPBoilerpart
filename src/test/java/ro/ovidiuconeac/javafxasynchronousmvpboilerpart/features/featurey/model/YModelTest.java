package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model.XModel;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model.XResponse;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ovidiu on 12/29/16.
 */

public class YModelTest {

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
}
