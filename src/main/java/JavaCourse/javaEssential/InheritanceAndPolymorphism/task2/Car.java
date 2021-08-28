package JavaCourse.javaEssential.InheritanceAndPolymorphism.task2;

public class Car extends Vehicle {


    Car(double coordinateX, double coordinateY,
        double coordinateZ, double cost,
        int speed, int yearOfRelease) {
        super(coordinateX, coordinateY, coordinateZ, cost, speed, yearOfRelease);
    }

    @Override
    public String toString() {
        return "Car{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", coordinateZ=" + coordinateZ +
                ", cost=" + cost +
                ", speed=" + speed +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
