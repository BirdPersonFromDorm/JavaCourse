package JavaCourse.javaEssential.Lists.MyArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MyArrayList someList = new MyArrayList();
        someList.add(0);
        someList.add(1);
        someList.add(2);
        someList.add(3);
        someList.add(4);
        someList.add(5);
        someList.add(6);
        //ДОбавляем по индексу число
        someList.add(1,100);
        //Удаляем по индексу число
        someList.remove(1);
        System.out.println(someList.size());
        System.out.println(someList.get(5));
        //Проверяем имееться ли данное число в листе
        System.out.println(someList.contains(105));
        someList.clear();

    }
}
