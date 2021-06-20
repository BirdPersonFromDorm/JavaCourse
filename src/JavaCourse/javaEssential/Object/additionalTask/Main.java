package JavaCourse.javaEssential.Object.additionalTask;

public class Main {
    public static void main(String[] args) {
        Animal sameAnimal = new Animal("Васька", 45, false);
        Animal sameAnimal2 = new Animal("Васька", 45, false);
        Animal sameAnimal3 = new Animal("Андрюша", 3, true);

        System.out.println(sameAnimal.equals(sameAnimal2));
        System.out.println(sameAnimal.equals(sameAnimal3));
        System.out.println(sameAnimal2.equals(sameAnimal3));

        System.out.println(sameAnimal.hashCode());
        System.out.println(sameAnimal2.hashCode());
        System.out.println(sameAnimal3.hashCode());


        System.out.println(sameAnimal.toString());
        System.out.println(sameAnimal2.toString());
        System.out.println(sameAnimal3.toString());


    }
}
