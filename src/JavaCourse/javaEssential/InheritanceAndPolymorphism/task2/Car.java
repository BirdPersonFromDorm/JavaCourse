package JavaCourse.javaEssential.InheritanceAndPolymorphism.task2;

public class Car extends Vehicle {


    Car(double coordinateX, double coordinateY,
        double coordinateZ, double cost,
        int speed, int yearOfRelease) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.speed = speed;
        this.cost = cost;
        this.yearOfRelease = yearOfRelease;
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
