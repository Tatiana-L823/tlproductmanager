package users.tl303.tlproductmanager.gui.listview;

import users.tl303.tlproductmanager.model.Item;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

/**
 * Zellenfabrik für die ListView in der Overview-Szene zur Darstellung von Warenobjekten.
 */
public class ItemCellFactory implements Callback<ListView<Item>, ListCell<Item>> {

    /**
     * Erstellt eine Zelle für ein Produktobjekt.
     *
     * @param listView Die ListView, für die die Zelle erstellt wird.
     * @return Eine Zelle für ein Produktobjekt.
     */
    @Override
    public ListCell<Item> call(ListView<Item> listView) {
        return new ItemCell();
    }
}
