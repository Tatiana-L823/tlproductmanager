package users.tl303.tlproductmanager.model;

public class Stock {
    private int quantity;

    public Stock() {
        this.quantity = 0; // Initialisieren Sie den Lagerbestand mit 0
    }

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        this.quantity -= amount;
        if (this.quantity < 0) {
            this.quantity = 0; // Stellen Sie sicher, dass der Lagerbestand nicht negativ wird
        }
    }
}
