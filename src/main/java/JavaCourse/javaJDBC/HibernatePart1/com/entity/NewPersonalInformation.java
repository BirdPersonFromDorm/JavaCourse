package JavaCourse.javaJDBC.HibernatePart1.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class NewPersonalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PersonalInformationID;
    private String MaritalStatus;
    private Date DateOfBirt;
    private String City;

    public int getPersonalInformationID() {
        return PersonalInformationID;
    }

    public void setPersonalInformationID(int personalInformationID) {
        PersonalInformationID = personalInformationID;
    }

    public String getMaritalStatus() {
        return MaritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        MaritalStatus = maritalStatus;
    }

    public Date getDateOfBirt() {
        return DateOfBirt;
    }

    public void setDateOfBirt(Date dateOfBirt) {
        DateOfBirt = dateOfBirt;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "NewPersonalInformation{" +
                "PersonalInformationID=" + PersonalInformationID +
                ", MaritalStatus='" + MaritalStatus + '\'' +
                ", DateOfBirt=" + DateOfBirt +
                ", City='" + City + '\'' +
                '}';
    }

}
