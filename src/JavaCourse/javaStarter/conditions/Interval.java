package JavaCourse.javaStarter.conditions;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int interval;
        System.out.println("Введите число от 0 до 100");
        Scanner scan = new Scanner(System.in);
        interval = scan.nextInt();

        if(interval>=0 && interval<15) {
            System.out.println("Вы ввели число принадлежащее промежутку: [0-14]");
        }else if(interval>=15 && interval<35){
            System.out.println("Вы ввели число принадлежащее промежутку: [15-35]");
        }else if(interval>=36 && interval<50){
            System.out.println("Вы ввели число принадлежащее промежутку: [36-50]");
        }else if(interval>=50 && interval<100){
            System.out.println("Вы ввели число принадлежащее промежутку: [50-100]");
        }else{
            System.out.println("Для кого указан диапазон?");
        }

    }
}
