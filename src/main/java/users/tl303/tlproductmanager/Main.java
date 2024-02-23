package users.tl303.tlproductmanager;

import users.tl303.tlproductmanager.gui.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        SceneManager.getInstance().setAndConfigureMainStage(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
