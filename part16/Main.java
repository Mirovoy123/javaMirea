package part16;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList<Integer> first = new ArrayList<>();
    private static final ArrayList<Integer> second = new ArrayList<>();
    private final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int turnCounter = 0;
            boolean botva = false;

            System.out.println("Enter the first player's cards.");
            for (int i = 0; i < 5; i++) {
                try {
                    int buff = in.nextInt();
                    if (buff > 9) throw new IOException();
                    if (buff == 0) buff = 10;
                    first.add(buff);
                } catch (IOException e) {
                    System.out.println("The value cannot be grater than 9.");
                    i--;
                }
            }

            System.out.println("Enter the second player's cards.");
            for (int i = 0; i < 5; i++){
                try {
                    int buff = in.nextInt();
                    if (buff > 9) throw new IOException();
                    if (buff == 0) buff = 10;
                    second.add(buff);
                } catch (IOException e) {
                    System.out.println("The value cannot be grater than 9.");
                    i--;
                }
            }

            while (first.size() > 0 && second.size() > 0) {
                gamePlay();
                turnCounter++;

                if (turnCounter > 106) {
                    botva = true;
                    break;
                }
            }
            if (botva) System.out.println("botva");
            else
                if (first.size() == 0)
                    System.out.println("second " + turnCounter);
                else System.out.println("first " + turnCounter);

            System.out.println("Continue?\n1)Yes.\n2)No.");
            String ans = in.next();
            if (!ans.equals("1") && !ans.equals("Yes") && !ans.equals("yes")) {
                System.out.print("Exiting...");
                System.exit(1);
            }
        }
    }
    public static void gamePlay() {
        if (first.get(0) > second.get(0)) {
            first.add(first.get(0));
            first.add(second.get(0));
            first.remove(0);
            second.remove(0);
        } else {
            second.add(second.get(0));
            second.add(first.get(0));
            second.remove(0);
            first.remove(0);
        }
    }
}