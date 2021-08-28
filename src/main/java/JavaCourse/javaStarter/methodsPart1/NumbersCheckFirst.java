package JavaCourse.javaStarter.methodsPart1;

import java.util.Scanner;

public class NumbersCheckFirst {

    public static void check(int n){
        if (n >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число для проверки на полоительность его отрицательность");
        int n = sc.nextInt();
        check(n);

    }
}

