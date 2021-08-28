package JavaCourse.javaStarter.conditions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int operand1 = 10;
        int operand2 = 0;
        System.out.println("Введите знак арифметической операции");
        Scanner input = new Scanner(System.in);
        String sing = input.next();

        switch (sing){
            case "+":
                System.out.println("Результат прибавления: " + (operand1+operand2));
                break;
            case "-":
                System.out.println("Результат вычитания: "+ (operand1-operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Деление на ноль запрещенно!");
                    break;
                }
                    System.out.println("Результат деления: " + (operand1/operand2));
                break;
            case "*":
                System.out.println("Результат умножения: " + (operand1*operand2));
                break;
            default:
                System.out.println("Данная арифметическая операция не предусмотренна");
                break;


        }


    }
}
