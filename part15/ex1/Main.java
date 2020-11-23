package part15.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>(6);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Введите добавляемый элемент списка:");
            list.add(in.next());
        }

        list.add(1,"бомба");
        ArrayList <String> list2 = new ArrayList<>();
        list2.add(0,"aaaaaaaaaa");
        list2.addAll(list);

        System.out.println("Первый лист: " + list);
        System.out.println("Второй лист: " + list2);

        ArrayList<String> copyOfList = (ArrayList<String>) list.clone();
        list.clear();
        System.out.println("Копия списка: " + copyOfList);

        System.out.println("Содержится ли в списке \"бомба\": " + list2.contains("бомба"));

        copyOfList.forEach(System.out::println);

        int a = (int)(Math.random()*4);
        System.out.printf("Элемент номер %d: " + list2.get(a),a);

        System.out.println("Номер первого \"бомба\": " + list2.indexOf("бомба"));

        System.out.println("Список list пустой? " + list.isEmpty());

        list2.remove(2);
        System.out.println("Список после удаления 3 элемента: " + list2);

        list2.remove("бомба");
        System.out.println("Список после удаления \"бомба\" " + list2);

        System.out.println("Размер списка: " + copyOfList.size());
    }
}
