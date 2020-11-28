package part18;

import java.util.Scanner;

public class ExceptionDemo {
    public void exceptionDemo1(){
        int a = 1/0;
    }
    public void exceptionDemo2(){
        double a = 1.0/0.0;
    }
    public void exceptionDemo3() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2 / i ); }
}