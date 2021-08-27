package JavaCourse.javaProfessional.ProblemWithThread.additionalTask;

public class SecondThread extends Thread{
    private Counter counter;

    public SecondThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
    counter.count();
    }
}
