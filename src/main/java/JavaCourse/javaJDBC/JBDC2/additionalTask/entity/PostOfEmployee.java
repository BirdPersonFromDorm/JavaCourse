package JavaCourse.javaJDBC.JBDC2.additionalTask.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostOfEmployee {

    private long PostOfEmployeeID;
    private double salary;
    private String post;

}
