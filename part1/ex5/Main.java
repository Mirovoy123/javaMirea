package ru.mirovoy123.javaMirea.part1.ex5;


public class Main {

    public static void main(String[] args) {
        int num = (int)(Math.random() * 10);
        System.out.printf("Number: %d\nAnswer: %d",num, factorial(num));
    }
    public static int factorial (int num){
        if (num == 1) return 1;
        else return num * factorial(num-1);
    }
}
