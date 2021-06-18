package JavaCourse.javaEssential.Abstraction.task1;

public class DOCHandler extends AbstractHandler{

    @Override
    void open() {
        System.out.println("Open DOC-file");
    }

    @Override
    void create() {
        System.out.println("Create DOC-file");
    }

    @Override
    void change() {
        System.out.println("Change DOC-file");
    }

    @Override
    void save() {
        System.out.println("Save DOC-file");
    }
}
