package JavaCourse.javaProfessional.ProblemWithThread.additionalTask;

public class Counter {
    private int count;

    synchronized void count(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + ++count);
        }
    }
}
