package part1.ex3;


public class Main {

    public static void main(String[] args) {
        double summ = 0;
        for (int i = 1; i <= 10; i++) {
            summ+=1.0/i;
        }
        System.out.printf("Answer: %.2f",summ);
    }
}
