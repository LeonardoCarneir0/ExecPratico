package model;

public abstract class Product {

    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void showProduct();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}