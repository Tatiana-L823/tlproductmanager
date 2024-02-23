package users.tl303.tlproductmanager.gui.listview;
import users.tl303.tlproductmanager.model.Item;
import javafx.scene.control.ListCell;
import javafx.scene.text.Font;
/**
 * Eigene Klasse für Zellen der ListView für Warenobjekte
 */
public class ItemCell extends ListCell<Item> {

        @Override
        protected void updateItem(Item itemToShow, boolean isEmpty) {
            super.updateItem(itemToShow, isEmpty);

            if (!isEmpty && itemToShow != null) {
                // Wenn ein Ware in der Zelle gezeigt werden soll
                setText(String.format(
                        "%-20s %-15s %-10s",
                        itemToShow.getName(), itemToShow.getCategory(), itemToShow.getQuantity()
                ));
                setFont(Font.font("Arial", 12)); // Beispiel für eine benutzerdefinierte Schriftart und -größe
            } else {
                // Wenn die Zelle leer sein soll
                setText("");
            }
        }
}
