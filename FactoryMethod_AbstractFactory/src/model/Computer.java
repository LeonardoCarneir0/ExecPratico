package model;

public class Computer extends Product {

    public Computer() {
        super("Computer", 3500.00);
    }

    @Override
    public void showProduct() {
        System.out.println("Produto: " + name);
        System.out.println("Preço: R$ " + price);
    }
}