import java.util.Comparator;
import java.util.Objects;

public class Human implements Comparable {
    private String name;
    private int age;

    private Human() { }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human:" + name + ' ' + age + "y.o.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.getAge() && Objects.equals(name, human.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {

        return age - ((Human)o).getAge();
    }
}
