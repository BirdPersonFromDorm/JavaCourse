package JavaCourse.javaJDBC.HibernatePart1.com.DAO;

import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewEmployeer;
import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;

import java.util.List;

public interface NewIEmployeer {
    NewEmployeer save(NewEmployeer newEmployeer);
    NewEmployeer getById(int id);
    void update(NewEmployeer newEmployeer);
    void delete(NewEmployeer newEmployeer);
    public List<NewEmployeer> getNewEmployeerByName(String name);
}
