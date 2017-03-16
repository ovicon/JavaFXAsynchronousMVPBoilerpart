package ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.NavigationController;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.presenter.YPresenter;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.presenter.YPresenterImpl;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by ovidiu on 2/24/17.
 */
public class YViewImpl implements Initializable, YView {

    @FXML
    private Label request1;
    @FXML
    private ProgressIndicator progressRequest1;
    @FXML
    private Label request2;
    @FXML
    private ProgressIndicator progressRequest2;

    private YPresenter presenter;
    private NavigationController navigationController;

    public void initialize(URL location, ResourceBundle resources) {
        this.presenter = new YPresenterImpl(this);
    }

    @FXML
    @Override
    public void requestAction1() {
        progressRequest1.setVisible(true);
        presenter.requestAction1();
    }

    @Override
    public void postResult1(String result) {
        request1.setText(result);
        progressRequest1.setVisible(false);
    }

    @FXML
    @Override
    public void requestAction2() {
        progressRequest2.setVisible(true);
        presenter.requestAction2();
    }

    @Override
    public void postResult2(String result) {
        request2.setText(result);
        progressRequest2.setVisible(false);
    }

    @FXML
    @Override
    public void requestFeatureX() {
        navigationController.requestFeatureX();
    }

    @Override
    public void setNavigationController(NavigationController navigationController) {
        this.navigationController = navigationController;
    }
}
