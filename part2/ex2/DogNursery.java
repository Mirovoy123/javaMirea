package part2.ex2;

import java.util.Scanner;

public class DogNursery {
    private final Dog[] nursery = new Dog[10];
    private int amountOfDogs = 0;
    private final Scanner sc = new Scanner(System.in);

    public Dog[] getNursery() { return nursery; }

    public void addDogs(){
        while (true) {
            System.out.println("Добавить собаку?\n1)Да\n2)Нет");
            String response = sc.next();
            if ((response.equals("Да") || response.equals("1")) && amountOfDogs < nursery.length) {
                nursery[amountOfDogs] = new Dog();
                System.out.println("Кличка?");
                nursery[amountOfDogs].setName(sc.next());
                System.out.println("Возраст?");
                nursery[amountOfDogs].setAge(sc.nextInt());
                amountOfDogs++;
            }
            else break;
        }
    }

}
