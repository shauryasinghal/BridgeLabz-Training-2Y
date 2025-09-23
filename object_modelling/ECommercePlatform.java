
// Self Problem 4: E-commerce Platform with Orders, Customers, and Products
import java.util.*;

class Product {
    String name;
    Product(String name) { this.name = name; }
}

class Order {
    List<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
}

class CustomerE {
    String name;
    CustomerE(String name) { this.name = name; }
    void placeOrder(Order o) {
        System.out.println(name + " placed an order.");
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        CustomerE c = new CustomerE("Neha");
        Order o = new Order();
        o.addProduct(new Product("Laptop"));
        c.placeOrder(o);
    }
}
