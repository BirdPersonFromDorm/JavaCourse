package JavaCourse.javaJDBC.HibernatePart1.com;

import JavaCourse.javaJDBC.HibernatePart1.com.DAO.NewPersonalInformationDAO;
import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;
import JavaCourse.javaJDBC.HibernatePart1.com.init.Init; 
import java.sql.Date;

public class Main {
    public static NewPersonalInformationDAO personalInformationDAO = new NewPersonalInformationDAO();
    public static final Init initDB = new Init();

    public static void main(String[] args) {

//        NewPersonalInformation newpersonalInformation = new NewPersonalInformation();
//        newpersonalInformation.setCity("new");
//        newpersonalInformation.setDateOfBirt(new Date(2000-18-12));
//        newpersonalInformation.setMaritalStatus("Женат");
//
//        personalInformationDAO.save(newpersonalInformation);
//
//        NewPersonalInformation result = personalInformationDAO.getById(5);
//        System.out.println(result);

//        result.setCity("NewCity");
//        personalInformationDAO.update(result);
//        personalInformationDAO.delete(result);

        //personalInformationDAO.delete(result);

        NewPersonalInformation sameNewCity = personalInformationDAO.getNewPersonalInformationByCity("new");
        System.out.println(sameNewCity);
    }
}
