package part7;

import part7.ex1.Cup;
import part7.ex1.Plate;
import part7.ex2.Labrador;
import part7.ex2.Pug;
import part7.ex3.Chair;
import part7.ex3.FurnitureShop;
import part7.ex3.Table;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1 for ex1\n2 for ex2\n3 for ex3");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                Cup cup = new Cup(true,true);
                System.out.println(cup);
                cup.Break();
                Plate plate = new Plate(5, "black");
                System.out.println(plate);
                plate.Break();
                break;
            case 2:
                Labrador labrador = new Labrador("Ollie",0);
                labrador.run();
                System.out.println(labrador);
                Pug pug = new Pug("Maya",14);
                System.out.println(pug);
                pug.run();
                break;
            case 3:
                Chair chair1 = new Chair(4,400,"wood","regular");
                Chair chair2 = new Chair(3,230,"steel","stool");
                Table table = new Table(5,1000,"glass");
                System.out.println(chair1);
                System.out.println(chair2);
                System.out.println(table);
                Table[] tables = new Table[1];
                tables[0] = table;
                Chair[] chairs = new Chair[2];
                chairs[0] = chair1;
                chairs[1] = chair2;
                FurnitureShop furnitureShop = new FurnitureShop(chairs, tables);
                furnitureShop.build();
                System.out.println(furnitureShop);
        }

    }
}