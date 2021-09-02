package JavaCourse.javaJDBC.HibernatePart1.com.DAO;

import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;

import org.hibernate.Session;
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
        return result;
    }

    public NewPersonalInformation update(NewPersonalInformation personalInformation) {
        Session session = initDB.getSession();
        session.beginTransaction();
        session.update(personalInformation);
        session.getTransaction().commit();
        session.close();
        return personalInformation;
    }

    public NewPersonalInformation delete(NewPersonalInformation personalInformation) {
        Session session = initDB.getSession();
        session.beginTransaction();
        session.delete(personalInformation);
        session.getTransaction().commit();
        session.close();
        return personalInformation;
    }

}
