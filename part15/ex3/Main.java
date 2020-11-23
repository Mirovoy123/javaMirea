package part15.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyCollection <String> list = new MyCollection<>(5);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Введите добавляемый элемент списка:");
            list.add(in.next());
        }

        list.add(1,"бомба");
        MyCollection <String> list2 = new MyCollection<>();
        list2.add(0,"aaaaaa");
        list2.addAll(list);

        System.out.println("Первая коллекция: " + list);
        System.out.println("Вторая коллекция: " + list2);

        MyCollection<String> copyOfList = (MyCollection<String>) list.clone();

        list.clear();

        System.out.println("Копия коллекции: " + copyOfList);

        System.out.println("Содержится ли в коллекции \"бомба\": " + list2.contains("бомба"));

        int a = (int)(Math.random()*4);
        System.out.printf("Элемент номер %d: " + list2.get(a) + "\n",a);

        System.out.println("Номер первой \"бомбы\": " + list2.indexOf("бомба"));

        System.out.println("Коллекция list пуста? " + list.isEmpty());
        System.out.println("Коллекция list2 пуста? " + list2.isEmpty());

        list2.remove(3);
        System.out.println("Коллекция после удаления 3 элемента: " + list2);

        list2.remove("бомба");
        System.out.println("Коллекция после удаления \"бомбы\" " + list2);

        System.out.println("Размер коллекции: " + copyOfList.size());
    }
}
