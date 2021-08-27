package JavaCourse.javaProfessional.Lambda.additionalTask;

public class Main {
    public static void main(String[] args) {

        Calculator add = ((firstNumber, secondNumber) -> firstNumber + secondNumber);
        Calculator sub = ((firstNumber, secondNumber) -> firstNumber - secondNumber);
        Calculator mul = ((firstNumber, secondNumber) -> firstNumber * secondNumber);
        Calculator div = ((firstNumber, secondNumber) -> secondNumber == 0 ? 0 : (firstNumber / secondNumber));


        System.out.println(add.calculate(1, 2));
        System.out.println(sub.calculate(1, 2));
        System.out.println(mul.calculate(1, 2));
        System.out.println(div.calculate(1, 0));
    }
}
