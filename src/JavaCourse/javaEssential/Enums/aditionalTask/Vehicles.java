package JavaCourse.javaEssential.Enums.aditionalTask;

public enum Vehicles {
    CAR(3412, "Red"),
    PLANE(1313, "Blue"),
    BUS(1232, "Yellow"),
    TRAM(4352, "Black");

    private int cost;
    private String color;

    Vehicles(int cost, String color) {
        this.cost = cost;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return name() + ": price = " + cost + "; color = " + getColor();
    }

}
