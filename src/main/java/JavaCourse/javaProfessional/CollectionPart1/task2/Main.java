package JavaCourse.javaProfessional.CollectionPart1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sameList = new LinkedList<>();
        System.out.println("Enter the size of the list");
        int size = Integer.parseInt(bf.readLine());

        getIntegerList(sameList, size);
        System.out.println(sameList);

        getMinimum(sameList);
        System.out.println(sameList);

    }
    public static List<Integer> getIntegerList(List<Integer> sameList, int size){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            sameList.add(random.nextInt(100));
        }

        return sameList;
    }
    public static List<Integer> getMinimum(List<Integer> sameList){
        Collections.sort(sameList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        return sameList;
    }
}
