package model;

public class PlaystationPortable extends Product {

    public PlaystationPortable() {
        super("Playstation Portable", 2000.00);
    }

    @Override
    public void showProduct() {
        System.out.println("Produto: " + name);
        System.out.println("Preço: R$ " + price);
    }
}