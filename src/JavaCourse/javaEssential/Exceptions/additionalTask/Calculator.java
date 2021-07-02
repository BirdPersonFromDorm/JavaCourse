package JavaCourse.javaEssential.Exceptions.additionalTask;

public class Calculator {
    public double add(double first, double second){
        return first + second;
    }
    public double sub(double first, double second){
        return first - second;
    }
    public double div(double first, double second){
        try{
            return first / second;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return -1;
    }
    public double mul(double first, double second){
        return first * second;
    }
}
