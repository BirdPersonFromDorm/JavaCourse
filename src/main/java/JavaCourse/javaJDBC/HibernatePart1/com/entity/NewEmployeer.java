package JavaCourse.javaJDBC.HibernatePart1.com.entity;

import javax.persistence.*;

@Entity
public class NewEmployeer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmployeerID;
    private String telefonNumber;
    @ManyToOne
    private NewPersonalInformation newPersonalInformation;

    public NewPersonalInformation getNewPersonalInformation() {
        return newPersonalInformation;
    }

    public void setNewPersonalInformation(NewPersonalInformation newPersonalInformation) {
        this.newPersonalInformation = newPersonalInformation;
    }

    public int getEmployeerID() {
        return EmployeerID;
    }

    public void setEmployeerID(int employeerID) {
        EmployeerID = employeerID;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    @Override
    public String toString() {
        return "NewEmployeer{" +
                "EmployeerID=" + EmployeerID +
                ", telefonNumber='" + telefonNumber + '\'' +
                '}';
    }
}
