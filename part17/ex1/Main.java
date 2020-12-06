package part17.ex1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Users//cool-//Desktop//proga//javafiles//file.txt");

        Scanner sc = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.print(sc.nextLine());
        printWriter.close();

    }

}