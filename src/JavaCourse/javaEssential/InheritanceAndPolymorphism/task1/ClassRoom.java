package JavaCourse.javaEssential.InheritanceAndPolymorphism.task1;

public class ClassRoom {


    ClassRoom(Pupil first, Pupil second, Pupil third, Pupil fourth){
        first.printName();
        first.read();
        first.relax();
        first.study();
        first.write();

        second.printName();
        second.read();
        second.relax();
        second.study();
        second.write();

        third.printName();
        third.read();
        third.relax();
        third.study();
        third.write();

        fourth.printName();
        fourth.read();
        fourth.relax();
        fourth.study();
        fourth.write();
    }

    ClassRoom(Pupil first){
        first.printName();
        first.read();
        first.relax();
        first.study();
        first.write();
    }
    ClassRoom(Pupil first, Pupil second, Pupil third){
        first.printName();
        first.read();
        first.relax();
        first.study();
        first.write();

        second.printName();
        second.read();
        second.relax();
        second.study();
        second.write();

        third.printName();
        third.read();
        third.relax();
        third.study();
        third.write();
    }
    ClassRoom(Pupil first, Pupil second){
        first.printName();
        first.read();
        first.relax();
        first.study();
        first.write();

        second.printName();
        second.read();
        second.relax();
        second.study();
        second.write();
    }
}
