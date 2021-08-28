package JavaCourse.javaProfessional.RegularExpressionsAndDateAPI.additionalTask;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        try{
            System.out.println("Enter login");
            String login = bf.readLine();

            if (login.matches("[\\w]{5,}+")){
                System.out.println("You entered the correct login");

                System.out.println("Enter your password");
                String password = bf.readLine();
                if (password.matches("[\\w0-9]+")){
                    System.out.println("You entered the correct password");
                }else {
                    System.out.println("You entered the wrong password");
                }
            }
            else
                System.out.println("You entered the wrong login");
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
