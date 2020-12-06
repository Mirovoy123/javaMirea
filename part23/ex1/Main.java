package part23.ex1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<String, String> names = Map.of(
                "Даниил", "Антошин",
                "Дмитрий", "Антошин",
                "Илья", "Дейдыш",
                "Глеб", "Дейдыш",
                "Михаил", "Задорный",
                "Василий", "Пупкин",
                "Гервовилий", "Верный",
                "Андрей", "Андреев",
                "Антон", "Овсиенко",
                "Елизавета", "Первая"
        );

        System.out.printf("До: %s%n", names);

        Set<String> lastNames = new HashSet<>();
        names = names.entrySet()
                .stream()
                .filter(entry -> lastNames.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));

        System.out.printf("После: %s%n", names);
    }

}