package users.tl303.tlproductmanager.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import users.tl303.tlproductmanager.logic.ItemManager;
import users.tl303.tlproductmanager.model.Item;
import users.tl303.tlproductmanager.model.Stock;

import java.util.Optional;

public class DetailController {
    private Item selectedItem;

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtCategory;
    @FXML
    private TextField txtPrice;
    @FXML
    private TextField txtStock;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnDelete;

    public void setSelectedItemAndDetails(Item item) {
        selectedItem = item;

        if (selectedItem == null) return;

        txtName.setText(selectedItem.getName());
        txtCategory.setText(selectedItem.getCategory());
        txtPrice.setText(String.valueOf(selectedItem.getPrice()));
        txtStock.setText(String.valueOf(selectedItem.getStock()));

        btnSave.setDisable(false);
    }

    @FXML
    private void saveItem() {
        String name = txtName.getText();
        String category = txtCategory.getText();
        double price = Double.parseDouble(txtPrice.getText());
        int stockValue = Integer.parseInt(txtStock.getText());

        // Erstellen Sie ein Stock-Objekt mit dem gegebenen Lagerbestandswert
        Stock stock = new Stock(stockValue);

        if (selectedItem == null) {
            Item newItem = new Item(name, category, 0, price, "No expiry date");
            newItem.setStock(stock); // Setzen Sie den Lagerbestand für das neue Element
            ItemManager.getInstance().addItem(newItem);
        } else {
            selectedItem.setName(name);
            selectedItem.setCategory(category);
            selectedItem.setPrice(price);
            selectedItem.setStock(stock);
            ItemManager.getInstance().updateItem(selectedItem);
        }

        openOverviewScene();
    }

    @FXML
    private void deleteItem() {
        if (selectedItem == null) return;

        Alert deleteConfirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        deleteConfirmationAlert.setContentText("Are you sure you want to delete this item?");
        Optional<ButtonType> result = deleteConfirmationAlert.showAndWait();

        if (result.isPresent() && result.get() == ButtonType.OK) {
            ItemManager.getInstance().removeItem(selectedItem);
            openOverviewScene();
        }
    }

    @FXML
    private void openOverviewScene() {
        SceneManager.getInstance().switchToOverviewScene();
    }
}
