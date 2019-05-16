public class Main {

    public static void main(String[] args) {
        System.out.println("+++++++++Task1+++++++++++++++");
       Task1 task1 = new Task1();
        task1.solution1OfTask();
        task1.rerandList();
        task1.solution2OfTask();

        System.out.println("+++++++++Task2+++++++++++++++");
        Task2 task2 = new Task2();
        task2.solution1OfTask();
        task2.setDifferentHuman();
        System.out.println("----------------------------");
        task2.solution2OfTask();
        System.out.println("----------------------------");
        System.out.println("+++++++++Task3+++++++++++++++");
        Task3 task3 = new Task3();
        task3.addHuman("Harold", 67);
        task3.addHuman("Genry", 7);
        task3.addHuman("Andy", 45);
        task3.addHuman("Kenny", 23);
        task3.addHuman("Tina", 22);
        System.out.println(task3);
    }
}
