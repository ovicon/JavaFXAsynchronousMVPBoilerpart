package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model;

import java.util.Random;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XModel {

    private Random random;

    public XModel() {
        random = new Random();
    }

    public XResponse requestAction1() {
        // Compute some data here
        return new XResponse("Response " + random.nextInt(10000));
    }

    public XResponse requestAction2() {
        // Compute some data here
        return new XResponse("Response " + random.nextInt(10000));
    }

    public XResponse requestAction3() {
        // Compute some data here
        return new XResponse("Response " + random.nextInt(10000));
    }
}
