package JavaCourse.javaEssential.InheritanceAndPolymorphism.additionalTask;

public class BluePrinter extends Printer {

    @Override
    public void print(String value) {
        System.out.println((char) 27 + "[34m" + "BluePrinter is " + value);
    }
}
