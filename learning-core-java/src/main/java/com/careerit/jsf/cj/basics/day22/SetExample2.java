package com.careerit.jsf.cj.basics.day22;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Product extends  Object {
    private int pid;
    private String pname;
    private double price;

    public Product(int pid, String pname, double price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals method called");
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return pid == product.pid && Double.compare(product.price, price) == 0 && Objects.equals(pname, product.pname);
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode method called");
        return Objects.hash(pid, pname, price);
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
    }

}
public class SetExample2 {

    public static void main(String[] args) {

        Product product1 = new Product(1001, "Dell Laptop", 45000);
        Product product2 = new Product(1001, "Dell Laptop", 45000);
        Product product3 = new Product(1001, "Dell Laptop", 45000);
        Product product4 = new Product(1004, "Asus Laptop", 75000);

        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        System.out.println(products.size());
    }
}
