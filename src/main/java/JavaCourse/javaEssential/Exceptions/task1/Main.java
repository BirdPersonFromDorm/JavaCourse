package JavaCourse.javaEssential.Exceptions.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static boolean isValidDate(String ourDate, String dateFormat) {
        if (ourDate == null) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(ourDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Worker> listOFWorkers = new ArrayList<Worker>();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of workers");
        int counter = Integer.parseInt(buffer.readLine());

        for (int i = 0; i < counter; i++) {
            String name;
            String post;
            String year;

            System.out.print("Name = ");
            name = buffer.readLine();
            System.out.print("Post = ");
            post = buffer.readLine();
            System.out.print("Year = ");
            year = buffer.readLine();

            isValidDate(year, "yy");

            listOFWorkers.add(new Worker(name, post, year));
        }
        System.out.println("All Workers:");

        Collections.sort(listOFWorkers, new Comparator<Worker>() {
            public int compare(Worker v1, Worker v2) {
                return v1.getName().compareTo(v2.getName());
            }
        });
        for (Worker counterOfWorker:listOFWorkers) {
            System.out.println(counterOfWorker);
        }

        System.out.println("Enter some year");
        int someYear = Integer.parseInt(buffer.readLine());
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for (Worker listOFWorker : listOFWorkers) {
            String year = listOFWorker.getYear();
            int workExperience = yearNow - Integer.parseInt(year);
            if (workExperience > someYear) {
                System.out.println("Worker: " + listOFWorker.getName() + " work more " + someYear + " years");
            }
        }
    }
}
