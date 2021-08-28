package JavaCourse.javaEssential.InheritanceAndPolymorphism.task1;

public class Pupil {
    private String name;
    public void printName(){
        System.out.println(name);
    }
    public Pupil(String name){
        this.name = name;
    }
    void study(){
        System.out.println("Study");
    }
    void read(){
        System.out.println("Read");
    }
    void write(){
        System.out.println("Write");
    }
    void relax(){
        System.out.println("Relax");
    }

}
