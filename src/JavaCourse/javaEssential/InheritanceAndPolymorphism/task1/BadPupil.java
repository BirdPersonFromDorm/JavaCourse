package JavaCourse.javaEssential.InheritanceAndPolymorphism.task1;

public class BadPupil extends Pupil{

    @Override
    public void printName() {
        super.printName();
    }

    public BadPupil(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println("Study is bad");
    }

    @Override
    void read() {
        System.out.println("Read is bad");
    }

    @Override
    void write() {
        System.out.println("Write is bad\n");
    }

    @Override
    void relax() {
        System.out.println("Relax is bad");
    }
}
