package JavaCourse.javaEssential.Lists.additionakTask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Teachers> someList = new ArrayList<>();
        Teachers teachers1 = new Teachers("Galina", "Galinovna");
        Teachers teachers2 = new Teachers("Marysya", "Ibragimova");
        Teachers teachers3 = new Teachers("Afanaviy", "Evdakimovich");
        Teachers teachers4 = new Teachers("Dmintyi", "Constantinovich");

        someList.add(teachers1);
        someList.add(teachers2);
        someList.add(teachers3);
        someList.add(teachers4);

        for (Teachers newSomeList:someList) {
            System.out.println(newSomeList.toString());
        }
//        System.out.println(someList.indexOf("Galina Galinovna"));
//        System.out.println(someList.indexOf("Dmintyi Constantinovich"));
    }
}
