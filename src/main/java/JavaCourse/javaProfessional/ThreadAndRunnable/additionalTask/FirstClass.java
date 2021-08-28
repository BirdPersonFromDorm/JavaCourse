package JavaCourse.javaProfessional.ThreadAndRunnable.additionalTask;

import java.util.List;

public class FirstClass extends Thread{
    private int[] sameText = {1,2,3,4,5};


    @Override
    public void run(){
        for (int i = 0; i < sameText.length; i++) {
            try {
                Thread.sleep(500);
                System.out.println(sameText[i]);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
