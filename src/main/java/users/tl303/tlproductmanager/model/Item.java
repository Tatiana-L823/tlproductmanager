package users.tl303.tlproductmanager.model;

import users.tl303.tlproductmanager.model.Stock;

/**
 * Datenhaltungsklasse für Artikel im Lager
 */
public class Item {
    //region Konstanten
    public static final String DEFAULT_STRING_VALUE = "noValueSet";
    public static final int DEFAULT_NUMBER_VALUE = -1;
    //endregion

    //region Attribute
    private String name;
    private String category;
    private int quantity;
    private double price;
    private String expiryDate;
    private Stock stock; // Lagerbestand für das Artikelobjekt
    //endregion

    //region Konstruktoren
    // Konstruktor ohne Parameter
    public Item() {
        name = DEFAULT_STRING_VALUE;
        category = DEFAULT_STRING_VALUE;
        quantity = DEFAULT_NUMBER_VALUE;
        price = DEFAULT_NUMBER_VALUE;
        expiryDate = DEFAULT_STRING_VALUE;
        stock = new Stock(); // Initialisieren Sie den Lagerbestand
    }

    public Item(String name, String category, int quantity, double price, String expiryDate) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
        this.expiryDate = expiryDate;
        stock = new Stock(); // Initialisieren Sie den Lagerbestand
    }

    //endregion

    //region Methoden
    // Getter und Setter für Stock-Attribut
    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }



    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }
    //endregion
}
