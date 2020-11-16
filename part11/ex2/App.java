package part11.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {
    public App() {
        super("Стороны света");

        setLayout(new BorderLayout());

        JButton northButton = new JButton("NORTH");
        JButton southButton = new JButton("SOUTH");
        JButton eastButton = new JButton("EAST");
        JButton westButton = new JButton("WEST");
        JButton centerButton = new JButton("CENTER");

        add(northButton, BorderLayout.NORTH);
        add(southButton, BorderLayout.SOUTH);
        add(eastButton, BorderLayout.EAST);
        add(westButton, BorderLayout.WEST);
        add(centerButton, BorderLayout.CENTER);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        ActionListener actionListenerCenter = e ->
                JOptionPane.showMessageDialog(this, "Добро пожаловать в ЦАО");
        ActionListener actionListenerNorth = e ->
                JOptionPane.showMessageDialog(this, "Добро пожаловать в САО");
        ActionListener actionListenerSouth = e ->
                JOptionPane.showMessageDialog(this, "Добро пожаловать в ЮАО");
        ActionListener actionListenerEast = e ->
                JOptionPane.showMessageDialog(this, "Добро пожаловать в ВАО");
        ActionListener actionListenerWest = e ->
                JOptionPane.showMessageDialog(this, "Добро пожаловать в ЗАО");

        centerButton.addActionListener(actionListenerCenter);
        northButton.addActionListener(actionListenerNorth);
        southButton.addActionListener(actionListenerSouth);
        eastButton.addActionListener(actionListenerEast);
        westButton.addActionListener(actionListenerWest);
    }
}
