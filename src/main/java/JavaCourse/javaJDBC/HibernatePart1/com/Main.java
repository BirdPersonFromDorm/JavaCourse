package JavaCourse.javaJDBC.HibernatePart1.com;

import JavaCourse.javaJDBC.HibernatePart1.com.DAO.NewPersonalInformationDAO;
import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;
import JavaCourse.javaJDBC.HibernatePart1.com.init.Init; 
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static NewPersonalInformationDAO personalInformationDAO = new NewPersonalInformationDAO();
    public static final Init initDB = new Init();

    public static void main(String[] args) {

//        NewPersonalInformation newpersonalInformation = new NewPersonalInformation();
//        newpersonalInformation.setCity("new");
//        newpersonalInformation.setDateOfBirt(LocalDate.of(2018,3,30));
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

//        List<NewPersonalInformation> listOfEntity = personalInformationDAO.getNewPersonalInformationByCity("SameNewCity");
//        for (NewPersonalInformation entity:listOfEntity) {
//            System.out.println("PersonalInformationID: " + entity.getPersonalInformationID());
//            System.out.println("MaritalStatus: "+ entity.getMaritalStatus());
//            System.out.println("DateOfBirt: " + entity.getDateOfBirt());
//            System.out.println("City: " + entity.getCity());
//            System.out.println("----------");
//        }


    }
}
