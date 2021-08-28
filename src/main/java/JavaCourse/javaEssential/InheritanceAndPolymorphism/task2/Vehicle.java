package JavaCourse.javaEssential.InheritanceAndPolymorphism.task2;

public class Vehicle {

    protected double coordinateX;
    protected double coordinateY;
    protected double coordinateZ;
    protected double cost;
    protected int speed;
    protected int yearOfRelease;


    public Vehicle(double coordinateX, double coordinateY, double coordinateZ, double cost, int speed, int yearOfRelease) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
        this.cost = cost;
        this.speed = speed;
        this.yearOfRelease = yearOfRelease;
    }


}

