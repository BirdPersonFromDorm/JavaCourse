package JavaCourse.javaProfessional.WorkWithString.task2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        String sentences = "Друг мой, друг мой." +
                "Я очень и очень болен." +
                "Сам не знаю, откуда взялась эта боль." +
                "То ли ветер свистит." +
                "Над пустым и безлюдным полем." +
                "То ль, как рощу в сентябрь." +
                "Осыпает мозги алкоголь.";

        String[] part = sentences.split("\\.");

        for (int i = 0; i < part.length; i++) {
            int half = part[i].length() % 2 == 0 ? part[i].length()/2 : part[i].length()/2 + 1;
            String first = part[i].substring(0, half);
            String second = part[i].substring(half);


            System.out.println(first + " } \n { " + second);
        }

    }
}
