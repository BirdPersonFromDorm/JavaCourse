package JavaCourse.javaStarter.loops;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {

        System.out.println("Введите количество клиентво");
        Scanner sc = new Scanner(System.in);
        int client = sc.nextInt();
        int result = 1;

        do {
            result *= client;
            client --;
        } while (client > 0);

        System.out.println("Количество возможных вариантов доставки товара: " + result);
    }
}
