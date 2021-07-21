package JavaCourse.javaProfessional.CollectionPart1.adittionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> sameList = new ArrayList<>();
        String isEnd = "end";

        while(true){
            try{
                String enter = br.readLine();
                if (enter.equalsIgnoreCase("End")){
                    break;
                }
                sameList.add(enter);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }

        System.out.println(sameList);
            
    }
}
