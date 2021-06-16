package JavaCourse.javaEssential.InheritanceAndPolymorphism.task2;

public class Main {
    public static void main(String[] args) {

    Vehicle car = new Car(1,1,1,
            2000,200,1992);
    Vehicle plane = new Plane(2,2,2,
            1200, 2000, 55);
    Vehicle ship = new Ship(3,3,3,
            4000, 50,2010);

        System.out.println(car.toString());
        System.out.println(plane.toString());
        System.out.println(ship.toString());



    }
}
