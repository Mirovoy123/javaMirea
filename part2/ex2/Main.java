package part2.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DogNursery xd = new DogNursery();
        xd.addDogs();
        while (true) {
            System.out.println("О какой собаке желаете получить информацию?\n0 для выхода.");
            int currentDog = sc.nextInt();
            if (currentDog == 0) break;
            else {
                System.out.println(xd.getNursery()[currentDog-1]);
            }
        }
    }
}
