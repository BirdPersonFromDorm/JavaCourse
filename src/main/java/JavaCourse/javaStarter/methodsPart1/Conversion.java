package JavaCourse.javaStarter.methodsPart1;

import java.util.Scanner;

public class Conversion {

    public static final double UAH_TO_RUB = 2.65;
    public static final double UAH_TO_USD = 27.55;
    public static final double RUB_TO_UAH = 0.38;
    public static final double RUB_TO_USD = 0.014;
    public static final double USD_TO_UAH = 73.39;
    public static final double USD_TO_RUB = 27.66;

    public static double convertFromUahToRum(double sum) {
        return sum * UAH_TO_RUB;
    }

    public static double convertFromUahToUsd(double sum) {
        return sum * UAH_TO_USD;
    }

    public static double convertFromRubToUah(double sum) {
        return sum * RUB_TO_UAH;
    }

    public static double convertFromRubToUsd(double sum) {
        return sum * RUB_TO_USD;
    }

    public static double convertFromUsdToRum(double sum) {
        return sum * USD_TO_RUB;
    }

    public static double convertFromUsdToUah(double sum) {
        return sum * USD_TO_UAH;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите валюту, которую вы хотите поменять\n Перечень: UAH - h; RUB - r; USD - d");
        String currencyFrom = sc.next();


        if (currencyFrom.equals("h")) {
            System.out.println("Введите валюту, котрую вы хотите получить\n Перечень: RUB - r; USD - d");
        } else if (currencyFrom.equals("r")) {
            System.out.println("Введите валюту, котрую вы хотите получить\n Перечень: UAH - h; USD - d");
        } else if (currencyFrom.equals("d")) {
            System.out.println("Введите валюту, котрую вы хотите получить\n Перечень: UAH - h; RUB - r");
        } else {
            System.out.println("Вы ввести не существующую валюту");
            return;
        }
        String currencyTo = sc.next();

        System.out.println("Введите сумму");
        double sum = sc.nextDouble();

        switch (currencyFrom) {
            case "h":
                if (currencyTo.equals("d")) {
                    System.out.println("В переводе с Гривен на Доллары ваша сумма составляет: " + convertFromUahToUsd(sum));
                } else if (currencyTo.equals("r")) {
                    System.out.println("В переводе с Гривен на Рубли ваша сумма составляет: " + convertFromUahToRum(sum));
                }
                break;
            case "r":
                if (currencyTo.equals("d")) {
                    System.out.println("В переводе с Рублей на Доллары ваша сумма составляет: " + convertFromRubToUsd(sum));
                } else if (currencyTo.equals("h")) {
                    System.out.println("В переводе с Рублей на Гривны ваша сумма составляет: " + convertFromRubToUah(sum));
                }
                break;
            case "d":
                if (currencyTo.equals("r")) {
                    System.out.println("В переводе с Доллара на Рубли ваша сумма составляет: " + convertFromUsdToRum(sum));
                } else if (currencyTo.equals("h")) {
                    System.out.println("В переводе с Доллара на Гривны ваша сумма составляет: " + convertFromUsdToUah(sum));
                }
                break;
            default:
                System.out.println("Вы ввесли неоректное значение");
                return;
        }
    }
}
