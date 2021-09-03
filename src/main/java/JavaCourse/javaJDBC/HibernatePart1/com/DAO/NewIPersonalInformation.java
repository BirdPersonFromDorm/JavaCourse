package JavaCourse.javaJDBC.HibernatePart1.com.DAO;

import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;

public interface NewIPersonalInformation {
    NewPersonalInformation save(NewPersonalInformation personalInformation);
    NewPersonalInformation getById(int id);
    void update(NewPersonalInformation personalInformation);
    void delete(NewPersonalInformation personalInformation);
    public NewPersonalInformation getNewPersonalInformationByCity(String city);

}
