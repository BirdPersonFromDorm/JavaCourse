package JavaCourse.javaEssential.ClassesAndObjects.additionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please, enter r");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        MyArea myArea = new MyArea();
        double result = myArea.areaOfCircle(num);

        System.out.println(result);
    }
}
