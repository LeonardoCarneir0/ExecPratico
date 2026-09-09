package model;

public class Notebook extends Product {

    public Notebook() {
        super("Notebook", 4500.00);
    }

    @Override
    public void showProduct() {
        System.out.println("Produto: " + name);
        System.out.println("Preço: R$ " + price);
    }
}
