package JavaCourse.javaProfessional.ProblemWithThread.additionalTask;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        FirstThread firstThread = new FirstThread(counter);
        SecondThread secondThread = new SecondThread(counter);
        ThirdThread thirdThread = new ThirdThread(counter);

        firstThread.setName("firstThread");

        firstThread.start();
        secondThread.start();
        thirdThread.start();

    }
}
