package JavaCourse.javaJDBC.HibernatePart1.com.entity;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Entity
public class NewPersonalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int PersonalInformationID;
    private String MaritalStatus;
    private LocalDate DateOfBirt;
    private String City;
    @OneToMany(cascade=CascadeType.ALL)
    private List<NewEmployeer> newEmployeer;

    public List<NewEmployeer> getNewEmployeer() {
        return newEmployeer;
    }

    public void setNewEmployeer(List<NewEmployeer> newEmployeer) {
        this.newEmployeer = newEmployeer;
    }

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

    public LocalDate getDateOfBirt() {
        return DateOfBirt;
    }

    public void setDateOfBirt(LocalDate dateOfBirt) {
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
