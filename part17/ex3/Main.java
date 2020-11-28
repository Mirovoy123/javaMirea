package part17.ex3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Users//cool-//Desktop//proga//javafiles//file.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        Scanner systemSc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(fileOutputStream);

        pw.print(systemSc.nextLine());
        pw.close();
        fileOutputStream.close();

    }

}