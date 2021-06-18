package JavaCourse.javaEssential.Abstraction.task1;

public class TXTHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("Open TXT-file");
    }

    @Override
    void create() {
        System.out.println("Create TXT-file");
    }

    @Override
    void change() {
        System.out.println("Change TXT-file");
    }

    @Override
    void save() {
        System.out.println("Save TXT-file");
    }
}
