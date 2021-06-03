package JavaCourse.javaStarter.array;

import java.util.Scanner;

public class ReversedArray {

    public static void myReverse(int[] array) {
        System.out.println("Обратный массив:");
        for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
        }
    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] newArray = new int[count];
        boolean full = false;
        for (int i = index, j = 0; i < count; i++, j++) {
            if (i <= ((array.length - index) + 1) && !full) {
                newArray[j] = array[i];
            } else {
                if (!full) {
                    full = true;
                    i -= index;
                }
                newArray[j] = 1;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив из " + size + " элементов");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        myReverse(array);

        System.out.println("\nРезультат работы функции subArray: ");
        int[] newArray = ReversedArray.subArray(array,2,7);
        for (int arrayForConsole:newArray) {
            System.out.print(arrayForConsole + " ");
        }
    }
}
