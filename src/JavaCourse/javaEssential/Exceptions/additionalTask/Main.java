package JavaCourse.javaEssential.Exceptions.additionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("What do you want to do with them: 1)add 2)sub 3)div 4)mul");
        Scanner sc2 = new Scanner(System.in);
        String result = sc2.nextLine();


        switch (result){
            case "add":
                System.out.println(calculator.add(number1, number2));
                break;
            case "sub":
                System.out.println(calculator.sub(number1, number2));
                break;
            case "div":
                System.out.println(calculator.div(number1, number2));
                break;
            case "mul":
                System.out.println(calculator.mul(number1, number2));
                break;
        }
    }
}
