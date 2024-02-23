package users.tl303.tlproductmanager.logic;
import users.tl303.tlproductmanager.model.Item;
import users.tl303.tlproductmanager.test.TestData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Comparator;

/**
 * Stellt die Liste von Artikeln bereit und implementiert Methoden zum Verwalten der Artikel
 * TODO 3 Methoden zur Sortierung implementieren
 */

public class ItemManager {
    //region Attribute
    private ObservableList<Item> items;
    private static ItemManager instance;

    private int sortToggle = 1;
    //endregion

    //region Konstruktoren
    private ItemManager() {
        //Überwachbare Liste definieren, bei der Listener registriert werden können,
        //die bei Änderungen der Liste bestimmten Code ausführen.
        //Mit FXCollections.observableList(liste) kann eine überwachbare Liste anhand einer normalen Liste erzeugt werden
        items = FXCollections.observableList(TestData.getTestItems());
    }
    //endregion

    //region Methoden
    public static synchronized ItemManager getInstance() {
        if (instance == null) instance = new ItemManager();
        return instance;
    }

    public ObservableList<Item> getItems() {
        return items;
    }

    public void sortByName() {
        items.sort(Comparator.comparing(Item::getName));
    }

    public void sortByCategory() {
        items.sort(Comparator.comparing(Item::getCategory));
    }

    public void sortByQuantity() {
        items.sort(Comparator.comparingInt(Item::getQuantity));
    }

    public void sortByPrice() {
        items.sort(Comparator.comparingDouble(Item::getPrice));
    }

    public void sortByExpiryDate() {
        items.sort(Comparator.comparing(Item::getExpiryDate));
    }
    //endregion
}
