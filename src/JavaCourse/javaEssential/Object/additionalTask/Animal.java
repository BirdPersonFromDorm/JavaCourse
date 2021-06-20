package JavaCourse.javaEssential.Object.additionalTask;

import java.util.Objects;

public class Animal {
    String name;
    int age;
    boolean tail;

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tail=" + tail +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == Animal.class) {
            Animal animal = (Animal) obj;
            return this.age == animal.age && this.tail == animal.tail ;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (tail ? 1 : 0);
        result = 37 * result + (int) age;
        result = 37 * result + (name == null ? 0 : name.hashCode());

        return result;
    }
}
