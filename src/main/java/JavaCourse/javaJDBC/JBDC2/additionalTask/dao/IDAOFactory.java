package JavaCourse.javaJDBC.JBDC2.additionalTask.dao;

import JavaCourse.javaJDBC.JBDC2.additionalTask.entity.PostOfEmployee;

public interface IDAOFactory {

    PostOfEmployeeDAO getPostOfEmployee();
}
