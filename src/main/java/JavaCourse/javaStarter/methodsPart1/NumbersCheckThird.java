package JavaCourse.javaStarter.methodsPart1;

import java.util.Scanner;

public class NumbersCheckThird {

    public static void check(int n) {
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 6 == 0 || n % 9 == 0) {
            System.out.println("Число делется нацело на одно из следующих значений: 2,3,5,6,9");
        }else {
            System.out.println("Число не делется нацело на одно из следующих значений: 2,3,5,6,9");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки на деление на 2,3,5,6,9");
        int n = sc.nextInt();
        check(n);
    }
}
