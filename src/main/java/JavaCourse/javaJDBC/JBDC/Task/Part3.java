package JavaCourse.javaJDBC.JBDC.Task;

import java.sql.*;

public class Part3 {

    private static String URL = "jdbc:mysql://localhost:3306/myjoinsdb?serverTimezone=UTC";
    private static String LOGIN = "root";
    private static String PASSWORD = "admin";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;

        try {
            System.out.println("Try to connect...");
            connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
            System.out.println("Connect is success");

            statement = connection.createStatement();

            String sql = "select Name , DateOfBirt, TelefonNumber from Employeer " +
                    "join PersonalInformation " +
                    "on Employeer.PersonalInformation = PersonalInformation.PersonalInformationID " +
                    "join PostOfEmployee on Employeer.PostOfEmployee = PostOfEmployee.PostOfEmployeeID " +
                    "where Post = 'Менеджер';";

            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                String Name = resultSet.getString(1);
                String DateOfBirt = resultSet.getString(2);
                String TelefonNumber = resultSet.getString(3);

                System.out.println(Name + " " + DateOfBirt + " " + TelefonNumber);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}
