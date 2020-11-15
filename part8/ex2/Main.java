package part8.ex2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ex2 Ex2 = new Ex2(args[0]);
        Ex2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ex2.setSize(450,350);
        Ex2.setVisible(true);
    }
}