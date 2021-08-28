package JavaCourse.javaProfessional.CollectionPart2.task;

public class Family {

    private String familyName;

    public Family(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyName() {
        return familyName;
    }

    @Override
    public String toString() {
        return familyName;
    }
}
