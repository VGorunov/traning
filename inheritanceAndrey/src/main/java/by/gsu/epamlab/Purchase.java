package by.gsu.epamlab;

import java.util.Objects;

public class Purchase {
    private String productName;
    private Byn price;
    private int numberOfPurchasedUnits;

    public Purchase() {
    }

    public Purchase(String productName, Byn price, int numberOfPurchasedUnits) {
        this.productName = productName;
        this.price = price;
        this.numberOfPurchasedUnits = numberOfPurchasedUnits;
    }

    public String getProductName() {
        return productName;
    }

    public Byn getPrice() {
        return price;
    }

    public int getNumberOfPurchasedUnits() {
        return numberOfPurchasedUnits;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(Byn price) {
        this.price = price;
    }

    public void setNumberOfPurchasedUnits(int numberOfPurchasedUnits) {
        this.numberOfPurchasedUnits = numberOfPurchasedUnits;
    }

    public Byn getCost() {
        Byn basePrice = price;
        Byn finalPrice = getFinalPrice(price);
        return finalPrice;
    }

    @Override
    public String toString() {
        return productName + ";" + price + ";" + numberOfPurchasedUnits + ";" + getCost();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(productName, purchase.productName) && Objects.equals(price, purchase.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price);
    }
}
