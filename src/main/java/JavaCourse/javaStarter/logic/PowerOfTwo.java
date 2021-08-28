package JavaCourse.javaStarter.logic;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();


        if ((number & (number - 1)) == 0) {
            System.out.println("Число: " + number + " являеться степенью двойки");
        } else {
            System.out.println("Число: " + number + " не являеться степенью двойки");
        }
    }
}
