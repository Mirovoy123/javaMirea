package part8.practice.test1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Первое число:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Второе число:"));

        JOptionPane.showMessageDialog(null, "Сумма:" + (num1+num2), "а",JOptionPane.PLAIN_MESSAGE);

    }
}
