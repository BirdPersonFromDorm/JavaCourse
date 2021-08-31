package JavaCourse.javaJDBC.JBDC2.additionalTask.dao;

import JavaCourse.javaJDBC.JBDC2.additionalTask.entity.PostOfEmployee;

import java.util.List;

public interface IPostOfEmployee {

    void add(PostOfEmployee postOfEmployee);
    PostOfEmployee getById(int id);
    void updatePrice(String post, double salary);
    void remove(String post);
    List<PostOfEmployee> getAllWherePostIs(String post);

}
