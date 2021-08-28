package JavaCourse.javaEssential.Abstraction.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter type of file: \n1)txt \n2)xml \n3)doc");
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();

        switch (file) {
            case "txt":
                AbstractHandler txtFile = new TXTHandler();
                txtFile.open();
                txtFile.create();
                txtFile.change();
                txtFile.save();
                break;
            case "xml":
                AbstractHandler xmlFile = new XMLHandler();
                xmlFile.open();
                xmlFile.create();
                xmlFile.change();
                xmlFile.save();
                break;
            case "doc":
                AbstractHandler docFile = new DOCHandler();
                docFile.open();
                docFile.create();
                docFile.change();
                docFile.save();
            default:
                System.out.println("You entered a non-existent file type");

        }


    }
}
