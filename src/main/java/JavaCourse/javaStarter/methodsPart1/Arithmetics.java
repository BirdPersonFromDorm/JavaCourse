package JavaCourse.javaStarter.methodsPart1;

import java.util.Scanner;

public class Arithmetics {

    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static float div(float a, float b) {
        if (b == 0) {
            return b;
        } else
            return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Введите 2 числа, для выполнения арифметических операций");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int resultAdd = add(a, b);
        System.out.println("Результат сложение чисел " + a + " и " + b + ": " + resultAdd);
        int resultSub = sub(a, b);
        System.out.println("Результат вычитания чисел " + a + " и " + b + ": " + resultSub);
        int resultMul = mul(a, b);
        System.out.println("Результат умножения чисел " + a + " и " + b + ": " + resultMul);
        float resultDiv = div(a, b);
        System.out.println("Результат деления чисел " + a + " и " + b + ": " + resultDiv);


    }
}
