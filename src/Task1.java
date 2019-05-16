import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Task1 {
    private List<Integer> randList = new ArrayList<>();

    public Task1() {
        for (int i = 0; i < 100; i++) {
            randList.add((int)(Math.random()*100+1));
        }
    }

    public void showList(){
        int counter = 1;
        System.out.println("Your list now: ");
        for(Integer i : randList) {
            System.out.print(i + "\t");
            if(counter%20 == 0)
                System.out.println();
            counter++;
        }
        System.out.println();
    }

    public void sortList(){
        Collections.sort(randList);
    }

    public void desortList(){
        Collections.sort(randList, ((Integer i1, Integer i2)->-(i1-i2)));
    }

    public void desortList2(){
        Collections.sort(randList);
        Collections.reverse(randList);
    }

    public void rerandList() {
        randList.clear();
        for (int i = 0; i < 100; i++) {
            randList.add((int)(Math.random()*100+1));
        }
        System.out.println("--------Rerandom--------");
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
