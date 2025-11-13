public class Product implements Taxable {
    int pID;
    double price;
    int quantity;
    public Product() {

    }
    public Product(int pID, double price, int quantity) {
        this.pID = pID;
        this.price = price;
        this.quantity = quantity;
    }

    public void calcTax() {
        double taxAmount = price * salesTax;
        System.out.println("Sales tax amount for product ID " + pID + " is Rs." + taxAmount);
    }
    
}
