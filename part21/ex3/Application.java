package part21.ex3;

import javax.swing.*;
import java.util.List;

public class Application extends JFrame{

    private JLabel label;
    private AbstractDocumentFactory documentFactory;
    private Document document;

    public Application() {
        super("Document");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.label = new JLabel();
        JPanel contents = new JPanel();
        contents.add(label);
        setContentPane(contents);

        setJMenuBar(createMenuBar());

        setSize(400, 300);
        setVisible(true);
    }

    private void chooseDocumentFactory(String type) {
        this.documentFactory = DocumentFactoryProvider.getFactory(type);
    }

    private JMenuBar createMenuBar(){
        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Type");
        List.of(
                "Image",
                "Music",
                "Text"
        ).forEach(type -> {
            JMenuItem button = new JMenuItem(type);
            button.addActionListener(e -> {
                chooseDocumentFactory(type);
            });
            menu1.add(button);
        });
        menuBar.add(menu1);

        JMenu menu2 = new JMenu("File");
        List.of(
                "New",
                "Open",
                "Save",
                "Exit"
        ).forEach(action -> {
            JMenuItem button = new JMenuItem(action);
            button.addActionListener(e -> {
                makeAction(action);
                updateInfo();
            });
            menu2.add(button);
        });
        menuBar.add(menu2);
        return menuBar;
    }

    private void makeAction(String action) {
        switch (action) {
            case "New":
                this.document = documentFactory.create();
                break;
            case "Open":
                this.document = documentFactory.open();
                break;
            case "Save":
                document.save();
                break;
            case "Exit":
                document.exit();
                break;
        }
    }

    private void updateInfo() {
        if (document == null) {
            label.setText("Document { type: null, file: null }");
        } else {
            label.setText(String.format(
                    "Document { type: %s, file: %s }",
                    document.getType(),
                    document.getFile().toString()
            ));
        }
    }

    public static void main(String[] args) {
        new Application();
    }

}
