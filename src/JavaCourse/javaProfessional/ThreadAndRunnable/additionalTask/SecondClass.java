package JavaCourse.javaProfessional.ThreadAndRunnable.additionalTask;

public class SecondClass extends Thread{
    private int[] sameText = {11,22,33,44,55};


    @Override
    public void run(){
        for (int i = 0; i < sameText.length; i++) {
            try {
                Thread.sleep(550);
                System.out.println(sameText[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
