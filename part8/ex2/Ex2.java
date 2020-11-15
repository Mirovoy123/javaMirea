package part8.ex2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;

    public class Ex2 extends JFrame {
        Image image;
        public Ex2(String str)  {
            super("sad times");
            try {
                image = ImageIO.read(new File(str));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void paint(Graphics g){
            g.drawImage(image,0,0,null);
        }
    }