

public class ProductMain {
    public static void main(String[] args) {
        Product[] p = new Product[5];

        p[0] = new Product(1, 50, 2);
        p[1] = new Product(2, 30, 5);
        p[2] = new Product(3, 70, 1);
        p[3] = new Product(4, 40, 3);
        p[4] = new Product(5, 20, 4);
        

        Product highest = p[0];
        for (int i = 0; i < p.length ; i++) {
            if (p[i].price < highest.price) {
                highest = p[i];
            }
        }
        System.out.println("Pid of the product with highest price: " + highest.pid);

        System.out.println("The Total amount spent on all products: " + calcValue(p));


        
    }
    public static int calcValue(Product[] products){
        int total = 0;
        for (Product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }
    

}