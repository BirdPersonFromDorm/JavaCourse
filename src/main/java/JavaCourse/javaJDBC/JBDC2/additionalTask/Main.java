package JavaCourse.javaJDBC.JBDC2.additionalTask;

import JavaCourse.javaJDBC.JBDC2.additionalTask.dao.DAOFactory;
import JavaCourse.javaJDBC.JBDC2.additionalTask.dao.IDAOFactory;
import JavaCourse.javaJDBC.JBDC2.additionalTask.dao.PostOfEmployeeDAO;
import JavaCourse.javaJDBC.JBDC2.additionalTask.entity.PostOfEmployee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDAOFactory factory = DAOFactory.getInstance();
        PostOfEmployeeDAO postOfEmployeeDAO = factory.getPostOfEmployee();

//        PostOfEmployee postOfEmployee = new PostOfEmployee(1000.0,"Менеджер");
//        postOfEmployeeDAO.add(postOfEmployee);
        //System.out.println(postOfEmployeeDAO.getById(2));
        //postOfEmployeeDAO.updatePrice("Something", 500);
        //postOfEmployeeDAO.remove("Something");
        List<PostOfEmployee> byPost = postOfEmployeeDAO.getAllWherePostIs("Менеджер");

        for (PostOfEmployee getAll:byPost ) {
            System.out.println(getAll);
        }

    }
}
