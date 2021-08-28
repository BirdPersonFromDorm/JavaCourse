package JavaCourse.javaEssential.StaticAndNestedClasses.additionalTask;

public class Calculator {

    public double add(double first, double second){
        return first + second;
    }
    public double sub(double first, double second){
        return first - second;
    }
    public double div(double first, double second){
        if (second == 0){
            return 0;
        }
        return first / second;
    }
    public double mul(double first, double second){
        return first * second;
    }


}
