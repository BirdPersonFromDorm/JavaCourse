package JavaCourse.javaProfessional.IteratorAndComparator.personalHomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Worker> listOfWorkers = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 2; i++) {
            listOfWorkers.add( new Worker(bf.readLine(),Integer.parseInt(bf.readLine()),Integer.parseInt(bf.readLine())));
        }
        //the first method
        //Collections.sort(listOfWorkers);

        //the second method
        PersonalWorker personalWorker = new PersonalWorker();
        Collections.sort(listOfWorkers, personalWorker);


        Iterator iterator = listOfWorkers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
