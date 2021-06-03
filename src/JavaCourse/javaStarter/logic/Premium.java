package JavaCourse.javaStarter.logic;

import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        int salary = 5000;
        System.out.println("Введите выслугу лет");
        Scanner cs = new Scanner(System.in);
        int years = cs.nextInt();

        if (years < 5) {
            System.out.println("Ваша премия составляет: " + (salary += salary * 0.1));
        } else if (years >= 5 && years < 10) {
            System.out.println("Ваша премия составляет: " + (salary += salary * 0.15));
        } else if (years >= 10 && years < 15) {
            System.out.println("Ваша премия составляет: " + (salary += salary * 0.25));
        } else if (years >= 15 && years < 20) {
            System.out.println("Ваша премия составляет: " + (salary += salary * 0.35));
        } else if (years >= 20 && years < 25) {
            System.out.println("Ваша премия составляет: " + (salary += salary * 0.45));
        } else if (years >= 25) {
            System.out.println("Ваша премия составляет: " + (salary += salary * 0.50));
        }
    }
}
