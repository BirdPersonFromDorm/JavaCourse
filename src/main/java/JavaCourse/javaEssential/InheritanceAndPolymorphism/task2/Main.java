package JavaCourse.javaEssential.InheritanceAndPolymorphism.task2;

public class Main {
    public static void main(String[] args) {

    Vehicle car = new Car(1,1,1,
            2000,200,1992);
    Vehicle plane = new Plane(2,2,2,
            1200, 2000, 55);
    Vehicle ship = new Ship(1,2,2,
            5000,40,1995);

        System.out.println(car.toString());
        System.out.println(plane.toString());
        System.out.println(ship.toString());



    }
}
