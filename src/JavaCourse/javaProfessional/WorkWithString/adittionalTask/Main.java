package JavaCourse.javaProfessional.WorkWithString.adittionalTask;


import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String sameString = "Друг мой, друг мой." +
                "Я очень и очень болен." +
                "Сам не знаю, откуда взялась эта боль." +
                "То ли ветер свистит" +
                "Над пустым и безлюдным полем." +
                "То ль, как рощу в сентябрь." +
                "Осыпает мозги алкоголь.";

        String[] words = sameString.split("\\.");

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String [] one = o1.split("\\s");
                String [] two = o2.split("\\s");
                return one.length - two.length;
            }
        });

        for(String s : words){
            System.out.println(s);
        }

    }
}
