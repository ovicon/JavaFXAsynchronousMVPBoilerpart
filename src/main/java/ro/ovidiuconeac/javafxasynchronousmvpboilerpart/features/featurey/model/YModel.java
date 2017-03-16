package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.model;

import java.util.Random;

/**
 * Created by ovidiu on 12/29/16.
 */

public class YModel {

    private Random random;

    public YModel() {
        random = new Random();
    }

    public YResponse requestAction1() {
        // Compute some data here
        return new YResponse("Response Y " + random.nextInt(10000));
    }

    public YResponse requestAction2() {
        // Compute some data here
        return new YResponse("Response Y " + random.nextInt(10000));
    }
}
