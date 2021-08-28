package JavaCourse.javaProfessional.Lambda.task1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int random = (int)(Math.random() * 100);

            myList.add(random);
        }

        System.out.println("Our values: ");
        for (int iterating: myList) {
            System.out.println(iterating);
        }

        int sum = myList.stream().map(x -> x * x).reduce((x,y) -> x+y).get();


        System.out.println("Our result: ");
        System.out.println(sum);


    }
}
