package JavaCourse.javaEssential.ClassesAndObjects.task3;

public class Car {
    private int year;
    private String color;
    private double speed;
    private int weight;

    public Car(){
        this(1);
    }
    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this(year);
        this.color= color;
    }

    public Car(int year, String color, double speed) {
        this(year,color);
        this.speed = speed;;
    }

    public Car(int year, String color, double speed, int weight) {
        this(year,color,speed);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
