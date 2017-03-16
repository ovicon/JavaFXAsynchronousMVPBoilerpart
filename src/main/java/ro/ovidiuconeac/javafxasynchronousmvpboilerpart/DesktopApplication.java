package ro.ovidiuconeac.javafxasynchronousmvpboilerpart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.FeatureXScene;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurex.view.XViewImpl;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.FeatureYScene;
import ro.ovidiuconeac.javafxasynchronousmvpboilerpart.features.featurey.view.YViewImpl;

import java.io.IOException;

/**
 * Created by ovidiu on 2/24/17.
 *
 * This is the main class of the application.
 * The UI is created here and it also acts as a navigation controller between the main views,
 * see "{@link NavigationController}" for more information.
 *
 * Implement
 */
public class DesktopApplication extends Application implements NavigationController {

    private Stage stage;
    private FeatureXScene sceneX;
    private FeatureYScene sceneY;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        createSceneForFeatureX();
        createSceneForFeatureY();
        requestFeatureX();
        stage.show();
    }

    @Override
    public void stop() {
        stage = null;
        sceneX = null;
        sceneY = null;
    }

    private void createSceneForFeatureX() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/layout/featurex_view.fxml"));
        Parent root = loader.load();
        ((XViewImpl)loader.getController()).setNavigationController(this);
        sceneX = new FeatureXScene(root);
    }

    private void createSceneForFeatureY() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/layout/featurey_view.fxml"));
        Parent root = loader.load();
        ((YViewImpl)loader.getController()).setNavigationController(this);
        sceneY = new FeatureYScene(root);
    }


    @Override
    public void requestFeatureY() {
        stage.setTitle("FeatureY");
        stage.setScene(sceneY);
    }

    @Override
    public void requestFeatureX() {
        stage.setTitle("FeatureX");
        stage.setScene(sceneX);
    }
}