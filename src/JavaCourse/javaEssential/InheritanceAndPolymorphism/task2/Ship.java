package JavaCourse.javaEssential.InheritanceAndPolymorphism.task2;

public class Ship extends Vehicle {
    protected int passengers;
    protected int port;



    Ship(double coordinateX, double coordinateY, double coordinateZ, double cost, int speed, int yearOfRelease) {
        super(coordinateX, coordinateY, coordinateZ, cost, speed, yearOfRelease);

        this.passengers = 30;
        this.port = 93;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengers=" + passengers +
                ", port=" + port +
                ", coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", coordinateZ=" + coordinateZ +
                ", cost=" + cost +
                ", speed=" + speed +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }
}
