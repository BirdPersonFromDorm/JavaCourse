package JavaCourse.javaProfessional.WorkWithString.task1;

public class Main {
    public static void main(String[] args) {
        String s = "Друг мой, друг мой." +
                "Я очень и очень болен." +
                "Сам не знаю, откуда взялась эта боль." +
                "То ли ветер свистит" +
                "Над пустым и безлюдным полем." +
                "То ль, как рощу в сентябрь." +
                "Осыпает мозги алкоголь.";

        String [] sentences = s.split("\\.");

        for (int i = 0; i < sentences.length; i++) {
            int firstSpaceIndex = sentences[i].indexOf(' ');
            int lastSpaceIndex = sentences[i].lastIndexOf(' ');
            String firstWord = sentences[i].substring(0, firstSpaceIndex).trim();
            String lastWord = sentences[i].substring(lastSpaceIndex).trim();

            sentences[i] = sentences[i].substring(firstSpaceIndex, lastSpaceIndex).trim();
            sentences[i] = lastWord + " " + sentences[i] + " " + firstWord;

            System.out.println(" " + sentences[i] + " ");
        }
    }
}
