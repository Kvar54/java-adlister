import java.util.List;

public class Coffee {
    long id;
    String name;
    double price;
    Roast roast;
    Supplier supplier;
    List<Shop> shops;

    public Coffee() {
    }

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Coffee(String name, double price, Roast roast, Supplier supplier) {
        this.name = name;
        this.price = price;
        this.roast = roast;
        this.supplier = supplier;
    }

    public Coffee(String name, double price, Roast roast, Supplier supplier, List<Shop> shops) {
        this.name = name;
        this.price = price;
        this.roast = roast;
        this.supplier = supplier;
        this.shops = shops;
    }

    public Coffee(long id, String name, double price, Roast roast, Supplier supplier, List<Shop> shops) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.roast = roast;
        this.supplier = supplier;
        this.shops = shops;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Roast getRoast() {
        return roast;
    }

    public void setRoast(Roast roast) {
        this.roast = roast;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
}