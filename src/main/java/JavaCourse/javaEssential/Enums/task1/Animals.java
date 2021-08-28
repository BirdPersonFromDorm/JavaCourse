package JavaCourse.javaEssential.Enums.task1;

public enum Animals {
    LION(2),
    TIGER(3),
    ZEBRA(2),
    CAT(4),
    DOG(5);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name() + ":" + " Age = " + age;
    }
}
