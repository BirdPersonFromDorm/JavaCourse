package JavaCourse.javaStarter.methodPart2;

import java.util.Scanner;

public class Delivery {
    //Почему не рекомендуеться исп. рекурсию для расчета фактарила:
    //Код страновиться слабочитаем, труден в разборе. Трудно отвледить сложенность.
    //Слабые места данного подхода:
    //Если ввести очень большое число для расчета фактарила, оно может не пометиться в int/long.

    public static int factorial(int n){
        if (n == 1 || n == 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return n * factorial(n - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println("Введите количество клиентов");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Количество возможных вариантов доставки товара: " + factorial(n));

    }
}
