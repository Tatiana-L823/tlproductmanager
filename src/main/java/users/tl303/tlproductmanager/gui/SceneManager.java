package users.tl303.tlproductmanager.gui;
import users.tl303.tlproductmanager.model.Item;
import users.tl303.tlproductmanager.settings.AppTexts;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
    //region Attribute
    private Stage mainStage;
    private static SceneManager instance;
    //endregion

    //region Konstruktoren
    private SceneManager() {
    }
    //endregion

    //region Methoden
    public static synchronized SceneManager getInstance() {
        if (instance == null) instance = new SceneManager();
        return instance;
    }

    public void setAndConfigureMainStage(Stage stage) {
        mainStage = stage;
        mainStage.setTitle(AppTexts.APP_NAME);
        switchToOverviewScene();
    }

    public void switchToOverviewScene() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/users/tl303/tlproductmanager/gui/listview/overview-view.fxml"));
            Scene overviewScene = new Scene(fxmlLoader.load());
            switchScene(overviewScene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void switchToDetailScene(Item selectedItem) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/users/tl303/tlproductmanager/gui/listview/detail-view.fxml"));
            Scene detailScene = new Scene(fxmlLoader.load());

            //Controller-Objekt über FXML-Loader beschaffen und das ausgewählte Tier hineingeben
            DetailController detailController = fxmlLoader.getController();
            detailController.setSelectedItemAndDetails(selectedItem);

            switchScene(detailScene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void switchScene(Scene scene) {
        mainStage.setScene(scene);
        mainStage.show();
    }
    //endregion
}

