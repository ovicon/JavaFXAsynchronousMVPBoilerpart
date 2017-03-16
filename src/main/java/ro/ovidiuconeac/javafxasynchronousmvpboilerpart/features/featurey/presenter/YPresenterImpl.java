package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.presenter;

import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.common.Util;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.model.YModel;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.model.YResponse;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.view.YView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static javafx.application.Platform.runLater;

/**
 * Created by ovidiu on 12/29/16.
 */

public class YPresenterImpl implements YPresenter {

    private YView view;
    private YModel model;
    private ExecutorService service;

    public YPresenterImpl(YView view) {
        this.view = view;
        this.model = new YModel();
        this.service = Executors.newCachedThreadPool();
    }

    @Override
    public void requestAction1() {
        service.execute(() -> {
            Util.simulateNetworkLatency(6000);
            YResponse result = model.requestAction1();
            runLater(() -> view.postResult1(result.getResult()));
        });
    }

    @Override
    public void requestAction2() {
        service.execute(() -> {
            Util.simulateNetworkLatency(5000);
            YResponse result = model.requestAction2();
            runLater(() -> view.postResult2(result.getResult()));
        });
    }
}
