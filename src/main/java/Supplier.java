import java.util.List;

public class Supplier {

    long id;
    String name;
    int established;
    List<Coffee> coffees;

    public Supplier() {
    }

    public Supplier(String name, int established) {
        this.name = name;
        this.established = established;
    }

    public Supplier(String name, int established, List<Coffee> coffees) {
        this.name = name;
        this.established = established;
        this.coffees = coffees;
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

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public void setCoffees(List<Coffee> coffees) {
        this.coffees = coffees;
    }
}