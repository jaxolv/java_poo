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
    public String name;
    public double price;
    public int quantity;

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
        + ", $ " + String.format("%.2f", price)
        + ", " + quantity
        + " units. Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
