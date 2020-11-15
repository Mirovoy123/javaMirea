package part8.ex3;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class Ex3 extends JFrame {
    Image image;
    public Ex3(String str)  {
        super("*pop pop pop pop pop pop pop pop*");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(569,513);
        this.setVisible(true);
        setLayout(new FlowLayout());
        try {
            image = ImageIO.read(new File(str));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void selectPicture(String abcArg) {
        try {
            image = ImageIO.read(new File(abcArg));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void paint(Graphics g){
        g.drawImage(image,0,0,null);
    }
}