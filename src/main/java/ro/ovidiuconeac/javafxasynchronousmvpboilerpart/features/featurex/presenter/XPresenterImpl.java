package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.presenter;

import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.common.Util;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model.XModel;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.model.XResponse;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.view.XView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static javafx.application.Platform.runLater;

/**
 * Created by ovidiu on 12/29/16.
 */

public class XPresenterImpl implements XPresenter {

    private XView view;
    private XModel model;
    private ExecutorService service;

    public XPresenterImpl(XView view) {
        this.view = view;
        this.model = new XModel();
        this.service = Executors.newCachedThreadPool();
    }

    @Override
    public void requestAction1() {
        service.execute(() -> {
            Util.simulateNetworkLatency(3000);
            XResponse result = model.requestAction1();
            runLater(() -> view.postResult1(result.getResult()));
        });
    }

    @Override
    public void requestAction2() {
        service.execute(() -> {
            Util.simulateNetworkLatency(2000);
            XResponse result = model.requestAction2();
            runLater(() -> view.postResult2(result.getResult()));
        });
    }

    @Override
    public void requestAction3() {
        service.execute(() -> {
            Util.simulateNetworkLatency(4000);
            XResponse result = model.requestAction3();
            runLater(() -> view.postResult3(result.getResult()));
        });
    }
}
