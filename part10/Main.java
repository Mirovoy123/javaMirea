package part10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            float n = sc.nextFloat();
            if (n == 0) break;
            System.out.println(n * n * n + 11 * n - 13);
            System.out.println(3*n*n+11);
        }
    }
    }
