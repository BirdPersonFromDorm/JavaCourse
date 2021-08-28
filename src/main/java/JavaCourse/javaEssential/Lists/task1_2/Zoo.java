package JavaCourse.javaEssential.Lists.task1_2;


import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> someAnimalList = new ArrayList<>();

        System.out.println("Old list os Animal");

        someAnimalList.add(0,"Lion");
        someAnimalList.add(1,"Dinosaur");
        someAnimalList.add(2,"Baboon");
        someAnimalList.add(3,"Cat");
        someAnimalList.add(4,"Dog");
        someAnimalList.add(5,"Chicken");
        someAnimalList.add(6,"Heron");
        someAnimalList .add(7,"Locust");

        for (String someAnimals:someAnimalList) {
            System.out.println(someAnimals);
        }
        System.out.println("Size: " + someAnimalList.size());


        System.out.println("New list os Animal");

        someAnimalList.remove(7);
        someAnimalList.remove(5);
        someAnimalList.remove(3);

        for (String someAnimals:someAnimalList) {
            System.out.println(someAnimals);
        }
        System.out.println("Size: " + someAnimalList.size());

    }


}
