package JavaCourse.javaEssential.InheritanceAndPolymorphism.task1;

public class GoodPupil extends Pupil{

    public GoodPupil(String name) {
        super(name);
    }

    @Override
    public void printName() {
        super.printName();
    }

    @Override
    void study() {
        System.out.println("Study is good");
    }

    @Override
    void read() {
        System.out.println("Read is good");
    }

    @Override
    void write() {
        System.out.println("Write is good\n");
    }

    @Override
    void relax() {
        System.out.println("Relax is good");
    }

}
