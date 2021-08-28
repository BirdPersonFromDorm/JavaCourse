package JavaCourse.javaProfessional.IteratorAndComparator.personalHomeWork;

public class Worker implements Comparable<Worker>{
    private String name;
    private int age;
    private int salary;

    public Worker(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    @Override
    public int compareTo(Worker worker) {
        return this.age - worker.age;
    }
}
