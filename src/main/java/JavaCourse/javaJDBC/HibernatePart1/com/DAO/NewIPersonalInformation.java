package JavaCourse.javaJDBC.HibernatePart1.com.DAO;

import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;

import java.util.List;

public interface NewIPersonalInformation {
    NewPersonalInformation save(NewPersonalInformation personalInformation);
    NewPersonalInformation getById(int id);
    void update(NewPersonalInformation personalInformation);
    void delete(NewPersonalInformation personalInformation);
    public List<NewPersonalInformation> getNewPersonalInformationByCity(String city);
}
