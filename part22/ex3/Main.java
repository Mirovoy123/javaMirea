package part22.ex3;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Task task = new Task(
                "Иван Иванов",
                new Date(System.currentTimeMillis() + 3 * 1000 * 60 * 60 * 24)
        );
        System.out.print(task.getWorker() + " закончит работу через ");
        String str = String.valueOf(task.durationTillDeadline().toDays());
        switch (str.charAt(str.length()-1)) {
            case '0':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println( str + " дней.");
                break;
            case '1':
                System.out.println( str + " день.");
                break;
            case '2':
            case '3':
            case '4':
                System.out.println( str + " дня.");
                break;
        }
    }

}