package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.view;

import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.common.SetNavigationController;

/**
 * Created by ovidiu on 2/24/17.
 */
public interface XView extends SetNavigationController {
    void requestAction1();
    void postResult1(String result);
    void requestAction2();
    void postResult2(String result);
    void requestAction3();
    void postResult3(String result);
    void requestFeatureY();
}
