package JavaCourse.javaEssential.InheritanceAndPolymorphism.task2;

public class Plane extends Vehicle {
    int height;
    int passengers;

    Plane(double coordinateX, double coordinateY,
          double coordinateZ, double cost,
          int speed, int yearOfRelease) {
        super(coordinateX,coordinateY, coordinateZ, cost, speed, yearOfRelease);
        this.passengers = 50;
        this.height = 1500;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", passengers=" + passengers +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", coordinateZ=" + coordinateZ +
                ", cost=" + cost +
                ", speed=" + speed +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
