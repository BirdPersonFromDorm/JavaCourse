package JavaCourse.javaStarter.variables;

public class Volume {
    public static void main(String[] args) {
        //Task 4

        final double PI = 3.1415926535;
        double v;
        double s;
        double r = 5;
        double h = 3;

        double volume = PI*Math.pow(r,2)*h;
        double area = 2*PI*Math.pow(r,2)+2*PI*Math.pow(r,2);

        System.out.println("volume: " + volume);
        System.out.println("area: " + area);

    }
}
