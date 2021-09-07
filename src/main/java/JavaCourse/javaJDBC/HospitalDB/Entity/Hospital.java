package JavaCourse.javaJDBC.HospitalDB.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int
}
