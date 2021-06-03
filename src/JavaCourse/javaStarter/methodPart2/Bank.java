package JavaCourse.javaStarter.methodPart2;

import java.util.Scanner;

public class Bank {

    public static void contribution(int sum){
        int loanAmount = 700;
        int cash = loanAmount - sum;
        if (cash>700 || cash<0){
            System.out.println("Вы выплатили весь долг!\n " + "Сумма переплаты составляет: " + (sum - loanAmount) + " руб");

        }else if(cash == 0){
            System.out.println("Вы выплатили весь долг!");
        }else{
            System.out.println("Сумма вашей задолжности составляет: " + cash + " руб");
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите сумму взноса");
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();

        contribution(sum);
    }
}
