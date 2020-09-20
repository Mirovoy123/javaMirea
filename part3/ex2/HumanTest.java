package part3.ex2;

import java.util.Scanner;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the human?");
        String nameBuff = scanner.next();
        human.setName(nameBuff);
        System.out.println("Age of the human?");
        int ageBuff = scanner.nextInt();
        human.setAge(ageBuff);
        while (true) {
            System.out.println("What do you wish to do?\n" +
                    "1)I want to know the name of the human.\n" +
                    "2)I want to know the age of the human.\n" +
                    "3)I want him to grab something.\n" +
                    "4)I want him to make some steps.\n" +
                    "5)I want him to scream!\n" +
                    "6)Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(human.getName());
                    break;
                case 2:
                    System.out.println(human.getAge());
                    break;
                case 3:
                    System.out.println("What do you want him to grab?");
                    scanner.nextLine();
                    String something = scanner.nextLine();
                    Human.Hand.grab(something);
                    break;
                case 4:
                    System.out.println("How many steps?");
                    int amount = scanner.nextInt();
                    Human.Leg.step(amount);
                    break;
                case 5:
                    Human.Head.scream();
                    break;
                case 6:
                    return;
            }
        }
    }
}
