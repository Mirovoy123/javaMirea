package part15.ex2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите добавляемый элемент списка:");
            String s = in.next();
            linkedList.add(s);
        }
        linkedList.add(1,"бомба");
        System.out.println(linkedList);

        System.out.println("Номер \"бомба\": " + linkedList.indexOf("бомба"));
        System.out.println("Содержится ли в списке \"бомба\": " + linkedList.contains("бомба"));
        System.out.println("Размер списка: " + linkedList.size());

        linkedList.remove("бомба");
        System.out.println("Список после удаления \"бомба\": " + linkedList);
        System.out.println(linkedList);

        linkedList.addLast("коко");
        linkedList.addFirst("джамбо");
        System.out.println(linkedList);

        System.out.println("Первый элемент: " + linkedList.peekFirst());
        System.out.println("Последний элемент: " + linkedList.peekLast());

        System.out.println("Удаляем первый элемент... " + linkedList.pollFirst());
        System.out.println("Удаляем последний элемент... " + linkedList.pollLast());
        System.out.print(linkedList);


    }
}