package JavaCourse.javaEssential.ClassesAndObjects.task2;

public class Main {
    public static void main(String[] args) {
        Car car0 = new Car();
        Car car1 = new Car(1);
        Car car2 = new Car(2, "Yellow");
        Car car3 = new Car(4, "White", 300);
        Car car4 = new Car(5, "Black", 250, 4000);

        System.out.println(car0.toString());
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());

    }
}
