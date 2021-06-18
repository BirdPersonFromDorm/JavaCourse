package JavaCourse.javaEssential.Abstraction.task1;

public class XMLHandler  extends AbstractHandler{

    @Override
    void open() {
        System.out.println("Open XML-file");
    }

    @Override
    void create() {
        System.out.println("Create XML-file");
    }

    @Override
    void change() {
        System.out.println("Change XML-file");
    }

    @Override
    void save() {
        System.out.println("Save XML-file");
    }
}
