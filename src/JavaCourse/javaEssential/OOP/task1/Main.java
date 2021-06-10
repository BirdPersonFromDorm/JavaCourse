package JavaCourse.javaEssential.OOP.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle");
        int heightRectangle = sc.nextInt();
        System.out.println("Enter the width of the rectangle");
        int widthRectangle = sc.nextInt();

        Rectangle rectangle = new Rectangle(heightRectangle,widthRectangle);
        double area = rectangle.areaCalculator(heightRectangle,widthRectangle);
        double perimeter = rectangle.perimeterCalculator(heightRectangle,widthRectangle);

        System.out.println("Area is " + area +
                            "\nPerimeter is " + perimeter);
    }
}
