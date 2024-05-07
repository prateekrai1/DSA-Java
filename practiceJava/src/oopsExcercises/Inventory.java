package oopsExcercises;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory(){
        products = new ArrayList<Product>();
    }
    public ArrayList<Product> getAllproducts(){
        return products;
    }
    public void addproduct(Product product){
        products.add(product);
    }
    public void remproduct(Product product){
        products.remove(product);
    }

    public static void main(String[] args) {
        Inventory inv1 = new Inventory();
        Product p1 = new Product("Soap",100);
        inv1.addproduct(p1);
        System.out.println(p1.getName());
    }
}
