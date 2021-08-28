package JavaCourse.javaEssential.InheritanceAndPolymorphism.additionalTask;

public class Main {
    public static void main(String[] args) {
        Printer typicalPrinter = new Printer();
        Printer beigePrinter = new BeigePrinter();
        Printer bluePrinter = new BluePrinter();

        typicalPrinter.print("Some text");
        beigePrinter.print("Some text");
        bluePrinter.print("Some text");
    }
}
