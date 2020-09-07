package ru.mirovoy123.javaMirea.part1.ex1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int length = rand.nextInt(100);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int summ = 0;
        for (int i = 0; i < length; i++) {
            summ += array[i];
        }
        System.out.println(summ);

        summ = 0;
        int count = 0;
        while (count < length) {
            summ += array[count];
            count++;
        }
        System.out.println(summ);

        summ = 0;
        count = 0;
        if (length != 0) {
            do {
                summ += array[count];
                count++;
            } while (count < length);
        }
        System.out.println(summ);
    }
}
