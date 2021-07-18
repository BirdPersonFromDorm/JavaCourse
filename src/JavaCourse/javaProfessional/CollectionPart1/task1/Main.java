package JavaCourse.javaProfessional.CollectionPart1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        List<String> sameList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            sameList.add(bf.readLine());
        }

        doubleValues(sameList);
        for (String listEnter:sameList) {
            System.out.print(listEnter + " ");
        }
    }

    public static List<String> doubleValues(List<String> list){
        int x = 0;
        for (int i=0; i<3; i++){
            list.add(x, list.get(x));
            x+=2;
        }
        return list;
    }
}
