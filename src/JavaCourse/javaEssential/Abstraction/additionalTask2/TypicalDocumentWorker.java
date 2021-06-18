package JavaCourse.javaEssential.Abstraction.additionalTask2;

public class TypicalDocumentWorker extends DocumentWorker{
    public void openDocument() {
        System.out.println("The document is open");
    }

    public void editDocument() {
        System.out.println("Document editing is available in the Pro version");
    }

    public void saveDocument() {
        System.out.println("Saving a document is available in the Pro version");
    }
}
