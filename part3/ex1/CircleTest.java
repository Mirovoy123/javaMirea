package part3.ex1;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        while (true) {
            System.out.println("Какое свойство желаете задать окружности?\n1)Цвет\n2)Радиус\n3)Длину окружности\n4)Выход");
            int answer = sc.nextInt();
            if (answer != 4) {
                switch (answer) {
                    case 1:
                        System.out.println("Введите цвет.");
                        circle.setColor(sc.next());
                        break;
                    case 2:
                        System.out.println("Введите радиус.");
                        circle.setRadius(sc.nextInt());
                        break;
                    case 3:
                        System.out.println("Введите длину окржности.");
                        circle.setCirc(sc.nextDouble());
                        break;
                }
            } else break;
        }
        while (true) {
            System.out.println("Какую информацию желаете получить об окружности?\n1)Цвет\n2)Радиус\n3)Длину окружности\n4)Всю информацию\n5)Выход");
            int answer = sc.nextInt();
            if (answer != 5) {
                switch (answer) {
                    case 1:
                        System.out.println(circle.getColor());
                        break;
                    case 2:
                        System.out.println(circle.getRadius());
                        break;
                    case 3:
                        System.out.println(circle.getCirc());
                        break;
                    case 4:
                        System.out.println(circle);
                        break;
                }
            } else break;
        }
    }
}
