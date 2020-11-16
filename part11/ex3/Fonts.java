package part11.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fonts extends JFrame {
    public Fonts() {
        super("Шрифты");

        Label label1 = new Label("Выберите шрифт");
        label1.setBounds(70, 40, 300, 20);
        label1.setFont(new Font("Arial", Font.ITALIC, 15));
        add(label1);

        JComboBox<String> fontBox = new JComboBox<>();
        fontBox.setEditable(true);
        fontBox.addItem("Times New Roman");
        fontBox.addItem("MS Sans Serif");
        fontBox.addItem("Courier New");
        fontBox.setBounds(70, 70, 300, 40);
        add(fontBox);

        Label label2 = new Label("Выберите цвет");
        label2.setBounds(70, 120, 300, 20);
        label2.setFont(new Font("Arial", Font.ITALIC, 15));
        add(label2);

        JComboBox<String>  colorBox = new JComboBox<>();
        colorBox.setEditable(true);
        colorBox.addItem("Blue");
        colorBox.addItem("Red");
        colorBox.addItem("Black");
        colorBox.setBounds(70, 150, 300, 40);
        add(colorBox);

        JTextArea text = new JTextArea("Lorem Ipsum", 2, 3);
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        text.setForeground(Color.BLUE);
        text.setBounds(70, 220, 300, 30);

        fontBox.addActionListener(e -> {
            if (fontBox.getSelectedIndex() == 0) {
                text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            }
            else if (fontBox.getSelectedIndex() == 1) {
                text.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
            }
            else if (fontBox.getSelectedIndex() == 2) {
                text.setFont(new Font("Courier New", Font.PLAIN, 20));
            }
        });

        colorBox.addActionListener(e -> {
            if (colorBox.getSelectedIndex() == 0) {
                text.setForeground(Color.BLUE);
            }
            else if (colorBox.getSelectedIndex() == 1) {
                text.setForeground(Color.RED);
            }
            else if (colorBox.getSelectedIndex() == 2) {
                text.setForeground(Color.BLACK);
            }
        });
        add(text);
        setSize(450,300);
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}