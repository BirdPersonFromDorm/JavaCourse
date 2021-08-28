package JavaCourse.javaProfessional.IOAndNIO.additionalTask;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\JavaCourse\\" +
                "src\\JavaCourse\\javaProfessional\\IOAndNIO\\additionalTask\\File.txt");
        
        try{
            Writer write = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(write);

            printWriter.println("One");
            printWriter.println("Two");
            printWriter.println("Three");

            printWriter.flush();
            printWriter.close();

            BufferedReader buffer = new BufferedReader(new FileReader(file));

            String value;
            while((value = buffer.readLine()) != null){
                System.out.println(value);
            }
            buffer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
