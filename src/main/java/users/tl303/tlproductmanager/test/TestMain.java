package users.tl303.tlproductmanager.test;

import javafx.application.Application;
import javafx.stage.Stage;
import users.tl303.tlproductmanager.gui.SceneManager;

import java.io.IOException;
public class TestMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Konfiguriere die Hauptbühne und zeige sie an
        SceneManager.getInstance().setAndConfigureMainStage(stage);
    }

    public static void main(String[] args) {
        // Starte die JavaFX-Anwendung
        launch();
    }

}
