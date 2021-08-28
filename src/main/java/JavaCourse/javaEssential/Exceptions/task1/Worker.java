package JavaCourse.javaEssential.Exceptions.task1;

public class Worker{
    private String name;
    private String post;
    private String year;

    public Worker(String name, String post, String year) {
        this.name = name;
        this.post = post;
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker: " +
                "name = " + name +
                ", post = " + post +
                ", year = " + year;
    }

}
