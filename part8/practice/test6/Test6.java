package part8.practice.test6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Test6 extends JFrame {
    private JTextField textField;
    private Font plain;
    private Font italic;
    private Font bold;
    private Font boldItalic;
    private JRadioButton plainB;
    private JRadioButton italicB;
    private JRadioButton boldB;
    private JRadioButton boldItalicB;
    private ButtonGroup buttonGroup;

    public Test6() {
        super("Ok");
        setLayout(new FlowLayout());
        textField = new JTextField("Поролон каучук",20);
        add(textField);

        plainB = new JRadioButton("Plain text",true);
        italicB = new JRadioButton("Italic text",false);
        boldB = new JRadioButton("Bold text",false);
        boldItalicB = new JRadioButton("Bold AND italic text (wow)",false);

        add(plainB);
        add(boldB);
        add(italicB);
        add(boldItalicB);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(plainB);
        buttonGroup.add(boldB);
        buttonGroup.add(italicB);
        buttonGroup.add(boldItalicB);

        plain = new Font("Serif",Font.PLAIN,28);
        bold = new Font("Serif",Font.BOLD,28);
        italic = new Font("Serif",Font.ITALIC,28);
        boldItalic = new Font("Serif",Font.BOLD + Font.ITALIC,28);

        textField.setFont(plain);

        plainB.addItemListener(new Handling(plain));
        boldB.addItemListener(new Handling(bold));
        italicB.addItemListener(new Handling(italic));
        boldItalicB.addItemListener(new Handling(boldItalic));
    }
    private class Handling implements ItemListener{
        Font font = null;
        public Handling(Font font){
            this.font = font;
        }
        @Override
        public void itemStateChanged(ItemEvent e) {
            textField.setFont(font);
        }

    }
}