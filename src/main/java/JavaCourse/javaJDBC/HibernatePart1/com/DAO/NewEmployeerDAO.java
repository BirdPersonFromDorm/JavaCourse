package JavaCourse.javaJDBC.HibernatePart1.com.DAO;

import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewEmployeer;
import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;

import static JavaCourse.javaJDBC.HibernatePart1.com.Main.initDB;

public class NewEmployeerDAO implements NewIEmployeer{

    @Override
    public NewEmployeer save(NewEmployeer newEmployeer) {
        Session session = initDB.getSession();
        session.beginTransaction();
        session.save(newEmployeer);
        session.getTransaction().commit();
        session.close();
        return newEmployeer;
    }


//    public List<NewEmployeer> getAllBooksByAuthor(NewPersonalInformation newPersonalInformation) {
//        Session session = initDB.getSession();
//        session.beginTransaction();
//        Query<NewEmployeer> query = session.createQuery(
//                "SELECT b FROM NewEmployeer b WHERE b.newPersonalInformation =:newPersonalInformation ");
//        query.setParameter("author", newPersonalInformation);
//        return query.list();
//    }

    @Override
    public NewEmployeer getById(int id) {
        Session session = initDB.getSession();
        session.beginTransaction();
        final NewEmployeer result = session.get(NewEmployeer.class, id);
        session.getTransaction().commit();
        session.close();
        return result != null ? result : new NewEmployeer();
    }

    @Override
    public void update(NewEmployeer newEmployeer) {
        Session session = initDB.getSession();
        session.beginTransaction();
        session.update(newEmployeer);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void delete(NewEmployeer newEmployeer) {
        Session session = initDB.getSession();
        session.beginTransaction();
        session.delete(newEmployeer);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<NewEmployeer> getNewEmployeerByName(String name) {
        return null;
    }
}
