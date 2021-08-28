package JavaCourse.javaStarter.methodsPart1;

import java.util.Scanner;

public class Calculator {

    public static int arithmeticMean(int a, int b, int c) {
        return (a + b + c)/2;
    }
    public static double geometricMean(double a, double b, double c){
        return Math.cbrt(a*b*c);
    }

    public static void main(String[] args) {

        System.out.println("Введите три числа");
        Scanner cs = new Scanner(System.in);

        int a = cs.nextInt();
        int b = cs.nextInt();
        int c = cs.nextInt();

        System.out.println("Среднее арифметическое: " + arithmeticMean(a,b,c));
        System.out.println("Среднее геометрическое: " + geometricMean(a,b,c));
    }
}
