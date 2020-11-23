package part12;

import javax.swing.*;
import java.awt.*;

public class GUi extends JFrame{
    public static double G = 6.67 * Math.pow(10, (-11));
    public GUi() {
        super("Планеты");
        Label label1 = new Label("Выберите планету");
        label1.setBounds(30, 30, 300, 20);
        label1.setFont(new Font("Arial", Font.ITALIC, 20));
        label1.setBackground(Color.LIGHT_GRAY);
        add(label1);

        JComboBox<String> planetBox = new JComboBox<>();
        planetBox.setEditable(true);
        planetBox.addItem("");
        planetBox.addItem("Меркурий");
        planetBox.addItem("Венера");
        planetBox.addItem("Земля");
        planetBox.addItem("Марс");
        planetBox.addItem("Юпитер");
        planetBox.addItem("Сатурн");
        planetBox.addItem("Уран");
        planetBox.addItem("Нептун");

        planetBox.setBounds(30, 60, 300, 40);
        add(planetBox);
        
        Label label2 = new Label("");
        label2.setBounds(30, 140, 300, 40);
        label2.setFont(new Font("serif", Font.PLAIN, 15));
        add(label2);
        
        Label label3 = new Label("");
        label3.setBounds(30, 170, 300, 40);
        label3.setFont(new Font("serif", Font.PLAIN, 15));
        add(label3);



        planetBox.addActionListener(e -> {
            if (planetBox.getSelectedIndex() == 0) {
                label2.setVisible(false);
                label3.setVisible(false);
            }
            else {
                label2.setVisible(true);
                label3.setVisible(true);
                if (planetBox.getSelectedIndex() == 1) {
                    label2.setText("Притяжение планеты Меркурий:");
                    label3.setText(G * Planet.Mercury.mass / (Planet.Mercury.radius * Planet.Mercury.radius) + " кг/с^2");
                }
                if (planetBox.getSelectedIndex() == 2) {
                    label2.setText("Притяжение планеты Венера:");
                    label3.setText(G * Planet.Venus.mass / (Planet.Venus.radius * Planet.Venus.radius) + " кг/с^2");
                }
                if (planetBox.getSelectedIndex() == 3) {
                    label2.setText("Притяжение планеты Земля:");
                    label3.setText(G * Planet.Earth.mass / (Planet.Earth.radius * Planet.Earth.radius) + " кг/с^2");
                }
                if (planetBox.getSelectedIndex() == 4) {
                    label2.setText("Притяжение планеты Марс:");
                    label3.setText(G * Planet.Mars.mass / (Planet.Mars.radius * Planet.Mars.radius) + " кг/с^2");
                }
                if (planetBox.getSelectedIndex() == 5) {
                    label2.setText("Притяжение планеты Юпитер:");
                    label3.setText(G * Planet.Jupiter.mass / (Planet.Jupiter.radius * Planet.Jupiter.radius) + " кг/с^2");
                }
                if (planetBox.getSelectedIndex() == 6) {
                    label2.setText("Притяжение планеты Сатурн:");
                    label3.setText(G * Planet.Saturn.mass / (Planet.Saturn.radius * Planet.Saturn.radius) + " кг/с^2");
                }
                if (planetBox.getSelectedIndex() == 7) {
                    label2.setText("Притяжение планеты Уран:");
                    label3.setText(G * Planet.Uranus.mass / (Planet.Uranus.radius * Planet.Uranus.radius) + " кг/с^2");
                }
                if (planetBox.getSelectedIndex() == 8) {
                    label2.setText("Притяжение планеты Нептун:");
                    label3.setText(G * Planet.Neptune.mass / (Planet.Neptune.radius * Planet.Neptune.radius) + " кг/с^2");
                }
            }
        });

        setSize(400,300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
