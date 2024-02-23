package users.tl303.tlproductmanager.gui;
import users.tl303.tlproductmanager.logic.ItemManager;
import users.tl303.tlproductmanager.model.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

public class OverviewController {
    //region Konstanten
    public static final int DEFAULT_CLICK_COUNT = 2;
    //endregion

    //region Attribute
    @FXML
    private ListView<Item> itemListView;
    //endregion

    //region Konstruktoren
    //endregion

    //region Methoden

    /**
     * Initialisiert/Konfiguriert Eigenschaften des Controllers nach der Erzeugung und Verknüpfung durch
     * den FXML-Loader (z. B. Befüllen der ListView mit Waren, Eventhandling implementieren, ...).
     * Diese Methode kann in jedem Controller implementiert werden und wird vom FXML-Loader automatisch beim Ladevorgang
     * der passenden FXML-Datei aufgerufen.
     */
    @FXML
    private void initialize() {
        // ListView mit Waren aus einer Liste befüllen
        itemListView.setItems(ItemManager.getInstance().getItems());

        // Eventhandling der ListView festlegen.
        // Normale Schreibweise für Maus-Klick-Events.
        itemListView.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getButton() == MouseButton.PRIMARY && mouseEvent.getClickCount() == DEFAULT_CLICK_COUNT) {
                openDetailSceneWithSelectedItem();
            }
        });

        // Lambda-Schreibweise für Tastatur-Tasten-Events
        itemListView.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                openDetailSceneWithSelectedItem();
            }
        });
    }

    //TODO: Implementieren Sie die Methode sortItems(ActionEvent actionEvent)
    @FXML
    private void sortItems(ActionEvent actionEvent) {
        // Hier Implementierung zum Sortieren der Waren hinzufügen
    }

    private void openDetailSceneWithSelectedItem() {
        // Ausgewählte Ware der ListView beschaffen und beim Wechsel in die Detailansicht übergeben
        Item selectedItem = itemListView.getSelectionModel().getSelectedItem();
        SceneManager.getInstance().switchToDetailScene(selectedItem);
    }

    @FXML
    private void openDetailScene() {
        // Diese Methode wird aufgerufen, wenn der "Detailansicht" Button geklickt wird
        SceneManager.getInstance().switchToDetailScene(null);
    }
    //endregion


}
