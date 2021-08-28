package JavaCourse.javaEssential.InheritanceAndPolymorphism.task1;

public class ExcellentPupil extends Pupil{

    public ExcellentPupil(String name) {
        super(name);
    }

    @Override
    public void printName() {
        super.printName();
    }

    @Override
    void study() {
        System.out.println("Study is excellent");
    }

    @Override
    void read() {
        System.out.println("Read is excellent");
    }

    @Override
    void relax() {
        System.out.println("Relax is excellent");
    }

    @Override
    void write() {
        System.out.println("Write is excellent\n");
    }
}
