package JavaCourse.javaProfessional.CollectionPart2.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Family> map = new HashMap<>();

        map.put("Gorlovka", new Family("Ivanovi"));
        map.put("Donetsk", new Family("Grushevi"));
        map.put("Kiev", new Family("Gubini"));
        map.put("Odessa", new Family("Collerovi"));
        map.put("Makeevka", new Family("Pingviveni"));

        Set<Map.Entry<String, Family>> set = map.entrySet();

        System.out.println("Choose a city from table: ");
        for (Map.Entry<String, Family> enterMap: set){
            System.out.println(enterMap.getKey());
        }

        String isThereCity = bf.readLine();
        if (map.get(isThereCity) != null)
            System.out.println("The people live in this city is " + map.get(isThereCity));
        else
            System.out.println("There is no such city");


    }
}
