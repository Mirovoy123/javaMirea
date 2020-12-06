package part22.ex1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Student student = new Student(0, "Дмитрий Антошин",
                dateFormat.parse("19-03-2001"));
        System.out.println(student.getBirthDate("medium"));
    }

}