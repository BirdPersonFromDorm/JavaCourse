package JavaCourse.javaJDBC.HibernatePart1.com.DAO;

import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

import static JavaCourse.javaJDBC.HibernatePart1.com.Main.initDB;

public class NewPersonalInformationDAO implements NewIPersonalInformation{

    public NewPersonalInformation save(NewPersonalInformation personalInformation) {
        Session session = initDB.getSession();
        session.beginTransaction();
        session.save(personalInformation);
        session.getTransaction().commit();
        session.close();
        return personalInformation;
    }

    public NewPersonalInformation getById(int id) {
        Session session = initDB.getSession();
        session.beginTransaction();
        final NewPersonalInformation result = session.get(NewPersonalInformation.class, id);
        session.getTransaction().commit();
        session.close();
        return result != null ? result : new NewPersonalInformation();
    }

    public void update(NewPersonalInformation personalInformation) {
        Session session = initDB.getSession();
        session.beginTransaction();
        session.update(personalInformation);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(NewPersonalInformation personalInformation) {
        Session session = initDB.getSession();
        session.beginTransaction();
        session.delete(personalInformation);
        session.getTransaction().commit();
        session.close();
    }

    public List<NewPersonalInformation> getNewPersonalInformationByCity(String city) {
        Session session = initDB.getSession();
        session.beginTransaction();
        List<NewPersonalInformation> smrList;
        Query<NewPersonalInformation> query = session.createQuery("select info from NewPersonalInformation info where info.City=:city");
        query.setParameter("city", city);
        smrList = query.list();
        session.close();
        return smrList;
    }
}
