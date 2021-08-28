package JavaCourse.javaStarter.conditions;

import java.util.Scanner;

public class AdditionalTask {

    public static void main(String[] args) {
        //Additional task

        Scanner input = new Scanner(System.in);
        System.out.println("Введите русское слово из таблицы \nТаблица:" +
                "\n Холодно"+
                "\n Тепло"+
                "\n Дождь"+
                "\n Мороз" +
                "\n Свежо" +
                "\n Вляжно" +
                "\n Сухо" +
                "\n Жарко" +
                "\n Туман" +
                "\n Ветренно");
        String someWord = input.next();

        switch (someWord){
            case "Холодно":
                System.out.println("Cold");
                break;
            case "Тепло":
                System.out.println("Warmly");
                break;
            case "Дождь":
                System.out.println("Rain");
                break;
            case "Мороз":
                System.out.println("Frost");
                break;
            case "Свежо":
                System.out.println("Fresh");
                break;
            case "Вляжно":
                System.out.println("Wet");
                break;
            case "Сухо":
                System.out.println("Dry");
                break;
            case "Жарко":
                System.out.println("Hot");
                break;
            case "Туман":
                System.out.println("Fog");
                break;
            case "Ветренно":
                System.out.println("Windy");
                break;
            default:
                System.out.println("Такого слова нет");
        }
    }
}
