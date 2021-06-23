package JavaCourse.javaEssential.Lists.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        plusOne(arrayList);

    }

    public static void plusOne(ArrayList<Integer> arrayList){
        ListIterator<Integer> iterator = arrayList.listIterator();

        while (iterator.hasNext()) {
            arrayList.set(iterator.nextIndex(), iterator.nextIndex() + 2);
            System.out.println(iterator.next());
        }
    }
}
