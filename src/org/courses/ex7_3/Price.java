package org.courses.ex7_3;

public class Price {

    private String name;
    private String shop;
    private double price;

    public Price(String name, String shop, double price) {
        this.name = name;
        this.shop = shop;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getShop() {
        return shop;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Price{" +
                "name='" + name + '\'' +
                ", shop='" + shop + '\'' +
                ", price=" + price +
                '}';
    }
}
