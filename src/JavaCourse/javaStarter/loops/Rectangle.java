package JavaCourse.javaStarter.loops;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        //Можно было захардкодить, сделав просто прямоугольник(10 итерация каждого из цислов).
        //Я сделал, чтобы можно было ввестизначения.После не переделывал уже.
        System.out.println("Введите число строк:");
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();
        System.out.println("Введите число столбцов:");
        int counter2 = sc.nextInt();

        for (int i = 0; i<counter; i++){

            for (int j = 0; j<counter2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
