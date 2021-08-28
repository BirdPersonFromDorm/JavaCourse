package JavaCourse.javaStarter.array;

import java.util.Random;
import java.util.Scanner;

public class CustomerArray {

    public static void createArray(int size) {

        // Создание массива и заполнение его рандомными числами
        Random random = new Random();
        int[] newArray = new int[size];
        System.out.println("Размер вашего массива: " + newArray.length);
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(100 - 1);
        }
        //Вывод массива на экран
        System.out.print("Ваш массив: ");
        for (int i : newArray) {
            System.out.print(i + " ");
        }

        //Поиск и вывод наименьшего и наибольшего элемента массива
        int min = newArray[0];
        int max = newArray[0];
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
            }
            if (newArray[i] > max) {
                max = newArray[i];
            }
        }
        System.out.println("\nmin = " + min + " max = " + max);

        // Сумма всех элементов
        int sum = 0;
        for (int i = 0; i < newArray.length; i++) {
            sum += newArray[i];
        }
        System.out.println("sum = " + sum);

        // Среднее арифметическое
        int arithmeticMean;
        arithmeticMean = sum / newArray.length;
        System.out.println("arithmeticMean = " + (double)arithmeticMean);

        // Не четные значения
        System.out.print("Odd values: ");
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 != 0) {
                System.out.print(newArray[i]+ " ");
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Введите замер массва");
        Scanner sc = new Scanner(System.in);

        createArray(sc.nextInt());

    }
}
