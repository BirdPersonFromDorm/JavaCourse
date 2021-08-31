package JavaCourse.javaEssential.Abstraction.additionalTask2;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void openDocument() {
        System.out.println("The document is open");
    }

    @Override
    public void editDocument() {
        System.out.println("Document edited");
    }

    @Override
    public void saveDocument() {
        System.out.println("The document is saved in the old format, " +
                "saving in other formats is available in the Expert version");
    }
}