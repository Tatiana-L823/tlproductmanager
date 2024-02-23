package users.tl303.tlproductmanager.test;

import users.tl303.tlproductmanager.model.Item;

import java.util.ArrayList;
import java.util.List;
public class TestData {
    public static List<Item> getTestItems() {
        List<Item> testItems = new ArrayList<>();

        // Hier können Sie Testdaten für Ihre Artikel hinzufügen
        testItems.add(new Item("Produkt 1", "Kategorie 1", 10, 20.0, "01.01.2023"));
        testItems.add(new Item("Produkt 2", "Kategorie 2", 5, 30.0, "01.01.2024"));
        // Weitere Testartikel hinzufügen...

        return testItems;
    }
}
