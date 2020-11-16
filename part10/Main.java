package part10;

import java.util.Scanner;

public class Main {

    public static int number4(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) return 1;
            else return 0;
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++)
            res += number4(len + 1, sum + i, k, s);
        return res;
    }

    public static int number5(int n) {
        n = n / 10;
        if (n == 0) return 1;
        return (1 + number5(n));
    }

    public static boolean number6(int n, int i) {
        if (n < 2) return false;
        else if (n == 2) return true;
        else if (n % i == 0) return false;
        else if (i < n / 2)
            return number6(n, i + 1);
        else return true;
    }

    public static void number7(int n, int i) {
        if (i > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % i == 0) {
            System.out.println(i);
            number7(n / i, i);
        } else number7(n, ++i);
    }

    public static int number9(int a, int b) {
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return number9(a, b - 1) + number9(a - 1, b - 1);
    }

    public static int number10(int n, int i) {
        return (n == 0) ? i : number10(n / 10, i * 10 + n % 10);
    }

    public static void number11() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int res = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) != '0') && (s.charAt(i + 1) != '0'))
                if (s.charAt(i) == '1') res++;
        }
        System.out.println(res);
    }

    public static void number12() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) == '1') || (s.charAt(i) == '3') || (s.charAt(i) == '5')
                    || (s.charAt(i) == '7') || (s.charAt(i) == '9')) {
                res += s.charAt(i);
            }
            System.out.println(res);
        }
    }

    public static void number13() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if((i % 2 != 0) && (!((i == s.length()-1) && (s.charAt(i) == '0')))) {
                res += s.charAt(i);
            }
        }
        System.out.println(res);
    }

    public static int number14(int n) {
        if (n == 0) return 0;
        number14(n / 10);
        System.out.print(n % 10 + " ");
        return 0;
    }

    public static int number15(int n) {
        if (n == 0) return 0;
        System.out.print(n % 10 + " ");
        number15(n / 10);
        return 0;
    }

    public static int number16() {
        Scanner in = new Scanner(System.in);
        int n, res = 0, max = 0;
        n = in.nextInt();
        while (n != 0) {
            if (n > max) {
                max = n;
                res = 1;
            }
            else if (n == max)
                res++;
            n = in.nextInt();
        }
        return res;
    }

    public static int number17() {
        int n, max = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        while (n != 0) {
            n = in.nextInt();
            if (n > max)
                max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Ввведите номер задания, для выхода - 0: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        while (number != 0) {
            switch (number) {
                case 1: {
                    int n = in.nextInt();
                    int k = 0;
                    int[] array = new int[n * n];
                    for (int i = 1; i < n + 1; i++)
                        for (int j = 0; j < i; j++) {
                            array[k] = i;
                            k++;
                        }
                    for (int i = 0; i < n; i++)
                        System.out.print(array[i] + " ");
                    break;
                }
                case 2: {
                    int n = in.nextInt();
                    for (int i = 0; i < n; i++)
                        System.out.print(i + 1 + " ");
                    break;
                }
                case 3: {
                    int A = in.nextInt();
                    int B = in.nextInt();
                    if (A < B)
                        for (int i = A; i < B + 1; i++)
                            System.out.print(i + " ");
                    else
                        for (int i = A; i > B - 1; i--)
                            System.out.print(i + " ");
                    break;
                }
                case 4: {
                    int k = in.nextInt();
                    int s = in.nextInt();
                    System.out.println(number4(0, 0, k, s));
                    break;
                }
                case 5: {
                    int n = in.nextInt();
                    System.out.println(number5(n));
                    break;
                }
                case 6: {
                    int n = in.nextInt();
                    if (number6(n, 2)) System.out.println("YES");
                    else System.out.println("NO");
                    break;
                }
                case 7: {
                    int n = in.nextInt();
                    number7(n, 2);
                    break;
                }
                case 8: {
                    String s = in.next();
                    String s1 = new StringBuilder(s).reverse().toString();
                    if (s.equals(s1)) System.out.println("YES");
                    else System.out.println("NO");
                    break;
                }
                case 9: {
                    int a = in.nextInt();
                    int b = in.nextInt();
                    System.out.println(number9(a, b));
                    break;
                }
                case 10: {
                    int n = in.nextInt();
                    System.out.println(number10(n, 0));
                    break;
                }
                case 11: {
                    number11();
                    break;
                }
                case 12: {
                    number12();
                    break;
                }
                case 13: {
                    number13();
                    break;
                }
                case 14: {
                    int n = in.nextInt();
                    number14(n);
                    break;
                }
                case 15: {
                    int n = in.nextInt();
                    number15(n);
                    break;
                }
                case 16: {
                    System.out.println(number16());
                    break;
                }
                case 17: {
                    System.out.println(number17());
                    break;
                }
            }
            System.out.println();
            System.out.println("Ввведите номер задания, для завершения программы введите 0: ");
            number = in.nextInt();
        }
    }
}