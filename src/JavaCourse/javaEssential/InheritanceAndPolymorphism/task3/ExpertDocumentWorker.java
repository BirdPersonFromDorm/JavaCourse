package JavaCourse.javaEssential.InheritanceAndPolymorphism.task3;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument() {
        System.out.println("The document was saved in a new format");
    }
}
