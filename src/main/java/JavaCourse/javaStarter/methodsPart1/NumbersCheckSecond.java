package JavaCourse.javaStarter.methodsPart1;

import java.util.Scanner;

public class NumbersCheckSecond {
    public static int temp = 2;

    private static void function1(int n) {
        if (n > 1) {
            if (n % temp != 0) {
                temp++;
                function1(n);
            } else if (n % temp == 0) {
                function2(temp, n);
            }
        }
    }

    private static void function2(int temp, int n) {
        if (temp == n) {
            System.out.println(n + " - просто число");
        }
            System.out.println(n + " - не простое число");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число для проверки, чтобы узнать простое оно или нет");
        int n = scanner.nextInt();
        function1(n);
    }
}

