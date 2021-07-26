package JavaCourse.javaProfessional.RegularExpressionsAndDateAPI.task1;

import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\JavaCourse\\src\\JavaCourse" +
                "\\javaProfessional\\RegularExpressionsAndDateAPI\\task1\\sameFile");

        try {
            BufferedReader buffer = new BufferedReader(new FileReader(file));

            String line = "";
            StringBuilder oldText = new StringBuilder();
            while((line = buffer.readLine()) != null){
                oldText.append(line).append("\n");
                System.out.println(line);
            }
            buffer.close();
            String newTest = oldText.toString().replaceAll("(?i)(in|as|far|the|to)", " Java ");



            FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\JavaCourse\\src\\JavaCourse" +
                    "\\javaProfessional\\RegularExpressionsAndDateAPI\\task1\\sameFile");
            writer.write(newTest);
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
