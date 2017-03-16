package ro.ovidiuconeac.javafxasynchronousmvpboilerpart;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by ovidiu on 2/24/17.
 */
public class DesktopApplication extends javafx.application.Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("/layout/featurex_view.fxml")));
        stage.setScene(scene);
        stage.show();
    }
}