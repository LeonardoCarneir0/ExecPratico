package model;

public class Playstation extends Product {

    public Playstation() {
        super("Playstation", 4000.00);
    }

    @Override
    public void showProduct() {
        System.out.println("Produto: " + name);
        System.out.println("Preço: R$ " + price);
    }
}