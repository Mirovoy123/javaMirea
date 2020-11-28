package part19.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите даные в формате:\nПервая строка - ФИО\nВторая строка - ИНН");
        sc.nextLine();
        Validator validator = new Validator();
        validator.validate(sc.nextLine());
    }
}
