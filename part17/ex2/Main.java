package part17.ex2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Users//cool-//Desktop//proga//javafiles//file.txt");

        Scanner systemSc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(file);
        FileReader fr = new FileReader(file);
        Scanner fileSc = new Scanner(fr);

        pw.print(systemSc.nextLine());
        pw.close();

        try {
            if (fileSc.hasNextLine())
            System.out.print(fileSc.nextLine());
            else throw new Exception();
        } catch (Exception e){
            System.out.println("File is empty");
        }
        fr.close();
    }

}