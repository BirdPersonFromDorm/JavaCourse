package JavaCourse.javaEssential.InheritanceAndPolymorphism.additionalTask;

public class BeigePrinter extends Printer {



    @Override
    public void print(String value) {
        System.out.println((char) 27 + "[33m" + "BeigePrinter is " + value);
    }
}
