package entities;

/*
 *  PROJETO DE CLASSE (UML)
 *                      _____________________________________
 *                     |                                     |
 * NOME DA CLASSE:     |               Product               |
 *                     |_____________________________________|
 *                     |                                     |
 *                     | - Name: string                      |
 * ATRIBUTOS:          | - Price: double                     |
 *                     | - Quantity: int                     |
 *                     |_____________________________________|
 *                     |                                     |
 *                     |+ TotalValueInStock(): double        |
 * MÉTODOS:            |+ AddProducts(quantity: int): void   |
 *                     |+ RemoveProducts(quantity: int): void|
 *                     |_____________________________________|
 */

public class Product {
    private String name;
    private double price;
    private int quantity;


    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }


    public double totalValueInStock() {
        return quantity * price;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }


    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units. Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
