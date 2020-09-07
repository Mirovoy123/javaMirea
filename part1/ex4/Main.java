package ru.mirovoy123.javaMirea.part1.ex4;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("First pass:");
            Random rand = new Random();
            int length = rand.nextInt(20);
            int[] array = new int[length];
            System.out.print("Array:");
            for (int i = 0; i < length; i++) {
                array[i] = rand.nextInt(10);
                System.out.print(" " + array[i]);
            }
            Arrays.sort(array);
            System.out.print("\nSorted array:");
            for (int i = 0; i < length; i++) {
                System.out.print(" " + array[i]);
            }
        System.out.println();

        System.out.println("Second pass:");
            int[] array2 = new int[(int)(Math.random() * 20)];
            System.out.print("Array:");
            for (int i = 0; i < array2.length; i++) {
                array2[i] = (int)(Math.random() * 10);
                System.out.print(" " + array2[i]);
            }
            Arrays.sort(array2);
            System.out.print("\nSorted array:");
            for (int i:array2) {
                System.out.print(" " + i);
            }
        }
}

