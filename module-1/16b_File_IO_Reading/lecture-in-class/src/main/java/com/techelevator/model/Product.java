package com.techelevator.model;

public class Product {
    private String productNumber;
    private String productColor;
    private String product;
    private double price;

    public String getProductNumber() {
        return productNumber;
    }

    public String getProductColor() {
        return productColor;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public Product(String productNumber, String productColor, String product, double price) {
        this.productNumber = productNumber;
        this.productColor = productColor;
        this.product = product;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber='" + productNumber + '\'' +
                ", productColor='" + productColor + '\'' +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
