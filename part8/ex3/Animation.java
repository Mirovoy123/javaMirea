package part8.ex3;

public class Animation extends Thread {

    private Ex3 mainWindow;
    private String[] abcArgs;
    private static int counter = 0;

    public Ex3 getMainWindow() {
        return mainWindow;
    }

    Animation(String []args){
        abcArgs = args;
        mainWindow = new Ex3(args[0]);
        while (true)
            start();
    }

    @Override
    public void start() {
        try {
            Thread.sleep(100);
            counter = (counter + 1) % abcArgs.length;
            mainWindow.selectPicture(abcArgs[counter]);
            mainWindow.paint(mainWindow.getGraphics());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}