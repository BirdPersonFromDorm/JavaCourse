package JavaCourse.javaProfessional.ProblemWithThread.additionalTask;

public class FirstThread extends Thread{
    private Counter counter;

    public FirstThread(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        counter.count();
    }
}
