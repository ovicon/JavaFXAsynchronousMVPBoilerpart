package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.presenter.XPresenter;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.presenter.XPresenterImpl;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by ovidiu on 2/24/17.
 */
public class XViewImpl implements Initializable, XView {

    @FXML
    private Label request1;
    @FXML
    private ProgressIndicator progressRequest1;
    @FXML
    private Label request2;
    @FXML
    private ProgressIndicator progressRequest2;
    @FXML
    private Label request3;
    @FXML
    private ProgressIndicator progressRequest3;

    private XPresenter presenter;

    public void initialize(URL location, ResourceBundle resources) {
        this.presenter = new XPresenterImpl(this);
    }

    @FXML
    public void requestAction1() {
        progressRequest1.setProgress(0.5);
        presenter.requestAction1();
    }

    public void postResult1(String result) {
        request1.setText(result);
        progressRequest1.setProgress(1.0);
    }

    @FXML
    public void requestAction2() {
        progressRequest2.setProgress(0.5);
        presenter.requestAction2();
    }

    public void postResult2(String result) {
        request2.setText(result);
        progressRequest2.setProgress(1.0);
    }

    @FXML
    public void requestAction3() {
        progressRequest3.setProgress(0.5);
        presenter.requestAction3();
    }

    public void postResult3(String result) {
        request3.setText(result);
        progressRequest3.setProgress(1.0);

    }
}
