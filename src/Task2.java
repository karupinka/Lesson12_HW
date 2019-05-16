import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    private List<Human> humanArrayListList = new ArrayList<>();

    public Task2() {
        humanArrayListList.add(new Human("Petya", 25));
        humanArrayListList.add(new Human("Vasya", 12));
        humanArrayListList.add(new Human("Boris", 27));
        humanArrayListList.add(new Human("Ann", 20));
        humanArrayListList.add(new Human("Ronald", 32));
    }

    public void showList(){
        int counter = 1;
        System.out.println("Your list now: ");
        for(Human h : humanArrayListList)
            System.out.println(h);
    }

    public void sortList(){
        Collections.sort(humanArrayListList);
    }

    public void desortList(){
        Collections.sort(humanArrayListList, ((Human h1, Human h2)->-(h1.getAge()-h2.getAge())));
    }

    public void desortList2(){
        Collections.sort(humanArrayListList);
        Collections.reverse(humanArrayListList);
    }

    public void addHumanInList(String name, int age){
        if (!name.isEmpty() && age >= 0)
            humanArrayListList.add(new Human(name, age));
        else
            System.out.println("Wrong data");
    }

    public void clearData(){
        humanArrayListList.clear();
    }

    public void setDifferentHuman(){
        humanArrayListList.clear();
        humanArrayListList.add(new Human("Nik", 42));
        humanArrayListList.add(new Human("Maria", 6));
        humanArrayListList.add(new Human("Fedor", 57));
        humanArrayListList.add(new Human("Tatyana", 15));
        humanArrayListList.add(new Human("Sasha", 10));
    }

    public void solution1OfTask(){
        showList();
        sortList();
        System.out.println("----------------After sort-------------");
        showList();
        System.out.println("----------------Reverse sort-------------");
        desortList();
        showList();
    }

    public void solution2OfTask(){
        showList();
        sortList();
        System.out.println("----------------After sort-------------");
        showList();
        System.out.println("----------------Reverse sort-------------");
        desortList2();
        showList();
    }
}
