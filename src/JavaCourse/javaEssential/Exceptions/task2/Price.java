package JavaCourse.javaEssential.Exceptions.task2;

public class Price {
    private String productName;
    private String shop;
    private String price;

    public Price(String productName, String shop, String price) {
        this.productName = productName;
        this.shop = shop;
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return "Shop = " + shop + ". Product = " + productName + ".";
    }
}
