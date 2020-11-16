package part11.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {
    public int number;
    public int attempts = 0;
    public int result = 0;
    public Game() {
        super("Игра");
        Random rnd = new Random();
        number = rnd.nextInt(20);

        Font font = new Font("serif", Font.PLAIN, 20);

        JButton button = new JButton("Я угадал?");
        button.setBackground(Color.ORANGE);
        button.setFont(font);

        JButton buttonExit = new JButton("Выход");
        buttonExit.setBackground(Color.DARK_GRAY);
        buttonExit.setFont(font);
        
        JButton buttonAgain = new JButton("Еще раз?");
        buttonAgain.setBackground(Color.ORANGE);
        buttonAgain.setFont(font);

        JTextField bigField = new JTextField("", 25);
        bigField.setFont(font);
        bigField.setHorizontalAlignment(JTextField.CENTER);
        bigField.setBackground(Color.PINK);

        bigField.setBounds(30, 100, 320, 40);
        button.setBounds(30,160,320,40);
        buttonExit.setBounds(30,260,320,40);
        buttonAgain.setBounds(30,360,320,40);
        buttonExit.setVisible(false);
        buttonAgain.setVisible(false);

        add(button);
        add(bigField);
        add(buttonExit);
        add(buttonAgain);

        JTextField text = new JTextField("Результат", 20);
        add(text);
        text.setFont(font);
        text.setHorizontalAlignment(JTextField.CENTER);
        text.setBackground(Color.PINK);

        text.setBounds(30, 230, 320, 30);

        setLayout(null);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setVisible(true);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener actionListener = e -> {
            int input = Integer.parseInt(bigField.getText());
            if (input > number) {
                text.setText("Число больше необходимого");
            }
            else if (input < number) {
                text.setText("Число меньше необходимого");
            }
            else {
                text.setText("Вы победили");
                result = 1;
                buttonExit.setVisible(true);
                button.setVisible(false);
                buttonAgain.setVisible(true);
            }
            attempts++;
            if ((attempts==3)&&(result!=1)) {
                text.setText("Вы проиграли");
                buttonExit.setVisible(true);
                button.setVisible(false);
                buttonAgain.setVisible(true);
            }
        };

        ActionListener actionListener2 = e -> System.exit(0);

        ActionListener actionListener3 = e -> {
            dispose();
            new Game();
        };

        button.addActionListener(actionListener);
        buttonExit.addActionListener(actionListener2);
        buttonAgain.addActionListener(actionListener3);
    }

}