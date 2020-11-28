package part18;

import part18.ExceptionDemo;

public class Main {
    public static void main(String[] args) {
        ExceptionDemo e = new ExceptionDemo();
        try {
            e.exceptionDemo1();
        } catch (Exception exception) {
            System.out.println("Division by 0!");
        }
        finally {
            System.out.println("Finally!");
        }
        e.exceptionDemo2();
        e.exceptionDemo3();
    }
}
