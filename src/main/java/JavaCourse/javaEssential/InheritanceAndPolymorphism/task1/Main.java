package JavaCourse.javaEssential.InheritanceAndPolymorphism.task1;

public class Main {
    public static void main(String[] args) {
        Pupil dima = new BadPupil("Dima");
        Pupil andrey = new GoodPupil("Andrey");
        Pupil roma = new ExcellentPupil("Roma");
        Pupil misha = new GoodPupil("Misha");

        ClassRoom class1A = new ClassRoom(dima, andrey, roma, misha);
    }
}
