package JavaCourse.javaJDBC.HibernatePart1.com;

import JavaCourse.javaJDBC.HibernatePart1.com.DAO.NewEmployeerDAO;
import JavaCourse.javaJDBC.HibernatePart1.com.DAO.NewIEmployeer;
import JavaCourse.javaJDBC.HibernatePart1.com.DAO.NewPersonalInformationDAO;
import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewEmployeer;
import JavaCourse.javaJDBC.HibernatePart1.com.entity.NewPersonalInformation;
import JavaCourse.javaJDBC.HibernatePart1.com.init.Init; 
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static NewPersonalInformationDAO personalInformationDAO = new NewPersonalInformationDAO();
    public static NewEmployeerDAO newEmployeerDAO = new NewEmployeerDAO();
    public static final Init initDB = new Init();

    public static void main(String[] args) {

        NewPersonalInformation result = personalInformationDAO.getById(8);
        System.out.println(result);


        List<NewEmployeer> sameListsameList = new ArrayList<>();


        NewEmployeer newEmployeer = new NewEmployeer();
        newEmployeer.setTelefonNumber("5555445");
        newEmployeer.setNewPersonalInformation(result);

        sameListsameList.add(newEmployeer);

        result.setNewEmployeer(sameListsameList);

        personalInformationDAO.update(result);


//        NewPersonalInformation newpersonalInformation = new NewPersonalInformation();
//        newpersonalInformation.setCity("Gorlovka");
//        newpersonalInformation.setDateOfBirt(LocalDate.of(2015,3,15));
//        newpersonalInformation.setMaritalStatus("Женат");
//
//        personalInformationDAO.save(newpersonalInformation);
//
//        personalInformationDAO.save(newpersonalInformation);


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
