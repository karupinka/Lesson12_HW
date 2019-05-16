import java.util.Set;
import java.util.TreeSet;

public class Task3 {
    private Set<Human> humanSet = new TreeSet<>();

    public void addHuman(String name, int age){
        humanSet.add(new Human(name, age));
    }

    @Override
    public String toString() {
        return humanSet.toString();
    }
}
