package JavaCourse.javaProfessional.IteratorAndComparator.personalHomeWork;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


//Создать класс Worker, создать лист workers, при помощи BufferedReader ввести значения имени, возраста и зарплаты
//Отсортировать двумя разными способами, вывести при помощи Iterator.


public class Main {
    public static void main(String[] args) throws IOException {
        List<Worker> listOfWorkers = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 1; i < 3; i++) {
            System.out.println("Enter Name, age and salary of the " + i + " worker");
            listOfWorkers.add( new Worker(bf.readLine(),Integer.parseInt(bf.readLine()),Integer.parseInt(bf.readLine())));
        }
        //the first method
        //Collections.sort(listOfWorkers);

        //The first realisation of the second method
        PersonalWorker personalWorker = new PersonalWorker();
        Collections.sort(listOfWorkers, personalWorker);

        //The second realisation of the second method
//        Collections.sort(listOfWorkers, new Comparator<Worker>() {
//            @Override
//            public int compare(Worker worker1, Worker worker2) {
//                return worker1.getName().compareTo(worker2.getName());
//            }
//        });


        Iterator iterator = listOfWorkers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
