package JavaCourse.javaEssential.Abstraction.additionalTask2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // key of ProDocumentWorker: Qd34fSf4af5Dgd
        // key of ExpertDocumentWorker: Fd34fGVd8fSD8

        System.out.println("Enter the key");
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();

        switch (temp) {
            case "Qd34fSf4af5Dgd":
                DocumentWorker proWorker = new ProDocumentWorker();
                proWorker.openDocument();
                proWorker.editDocument();
                proWorker.saveDocument();
                break;
            case "Fd34fGVd8fSD8":
                DocumentWorker expertWorker = new ExpertDocumentWorker();
                expertWorker.openDocument();
                expertWorker.editDocument();
                expertWorker.saveDocument();
                break;
            default:
                DocumentWorker basicWorker = new TypicalDocumentWorker();
                basicWorker.openDocument();
                basicWorker.editDocument();
                basicWorker.saveDocument();

        }
    }

}
