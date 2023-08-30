import java.util.List;

public class Shop {

    int id;
    String name;
    String address;
    List<Coffee> coffees;

    public Shop() {
    }

    public Shop(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Shop(String name, String address, List<Coffee> coffees) {
        this.name = name;
        this.address = address;
        this.coffees = coffees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public void setCoffees(List<Coffee> coffees) {
        this.coffees = coffees;
    }
}