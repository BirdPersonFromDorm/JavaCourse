package JavaCourse.javaStarter.logic;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //First method
        if ((number%2)==0){
            System.out.println("Число являеться четным");
        } else
            System.out.println("Число не являеться четным");

        //Second method
        if ((number & 1)==0){
            System.out.println("Число являеться четным");
        } else
            System.out.println("Число не являеться четным");

    }
}
