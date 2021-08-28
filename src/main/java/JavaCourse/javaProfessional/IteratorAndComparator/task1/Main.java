package JavaCourse.javaProfessional.IteratorAndComparator.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listOFName = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listOFName.add("Name " + i);
        }

        Iterator iterator = listOFName.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
