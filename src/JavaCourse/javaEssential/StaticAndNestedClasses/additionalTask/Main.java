package JavaCourse.javaEssential.StaticAndNestedClasses.additionalTask;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        double resultAdd = cal.add(1,2);
        double resultSub = cal.sub(1,2);
        double resultDiv = cal.div(1,2);
        double resultMul = cal.mul(1,2);

        System.out.println("resultAdd = " + resultAdd +
                "\nresultSub = " + resultSub +
                "\nresultDiv = " +  resultDiv +
                "\nresultMul = " + resultMul);
    }
}
