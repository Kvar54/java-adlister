import java.util.List;

public class Roast {

    long id;
    String name;
    List<Coffee> coffees;

    public Roast() {
    }

    public Roast(String name) {
        this.name = name;
    }

    public Roast(String name, List<Coffee> coffees) {
        this.name = name;
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

    public List<Coffee> getCoffees() {
        return coffees;
    }

    public void setCoffees(List<Coffee> coffees) {
        this.coffees = coffees;
    }
}
