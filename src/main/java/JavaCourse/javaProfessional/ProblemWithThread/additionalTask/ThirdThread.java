package JavaCourse.javaProfessional.ProblemWithThread.additionalTask;

public class ThirdThread extends Thread{
    private Counter counter;

    public ThirdThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.count();

    }
}
