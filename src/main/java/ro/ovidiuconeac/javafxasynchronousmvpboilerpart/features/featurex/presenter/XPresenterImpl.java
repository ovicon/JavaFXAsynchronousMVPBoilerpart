package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.presenter;

import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.common.Util;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model.XModel;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model.XResponse;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.view.XView;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XPresenterImpl implements XPresenter {

    private XView view;
    private XModel model;

    public XPresenterImpl(XView view) {
        this.view = view;
        this.model = new XModel();
    }

    @Override
    public void requestAction1() {
        Util.simulateNetworkLatency(5000);
        XResponse result = model.requestAction1();
        view.postResult1(result.getResult());
    }

    @Override
    public void requestAction2() {
        Util.simulateNetworkLatency(4000);
        XResponse result = model.requestAction2();
        view.postResult2(result.getResult());
    }

    @Override
    public void requestAction3() {
        Util.simulateNetworkLatency(6000);
        XResponse result = model.requestAction3();
        view.postResult3(result.getResult());
    }
}
