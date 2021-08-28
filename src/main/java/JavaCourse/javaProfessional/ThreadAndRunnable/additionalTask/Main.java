package JavaCourse.javaProfessional.ThreadAndRunnable.additionalTask;

public class Main {
    public static void main(String[] args) {


        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();


        firstClass.start();
        secondClass.start();
    }
}
