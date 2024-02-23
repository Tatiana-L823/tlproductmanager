/**
 *
 */
module users.tl303.tlproductmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens users.tl303.tlproductmanager to javafx.fxml;
    exports users.tl303.tlproductmanager;
    exports users.tl303.tlproductmanager.gui;
    opens users.tl303.tlproductmanager.gui to javafx.fxml;
    exports users.tl303.tlproductmanager.gui.listview;
    opens users.tl303.tlproductmanager.gui.listview to javafx.fxml;
}