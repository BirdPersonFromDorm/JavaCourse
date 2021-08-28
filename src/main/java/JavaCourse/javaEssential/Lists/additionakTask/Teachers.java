package JavaCourse.javaEssential.Lists.additionakTask;

public class Teachers {

    private String name;
    private String surName;

    public Teachers(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "name= " + name + " surName= " + surName;
    }
}
