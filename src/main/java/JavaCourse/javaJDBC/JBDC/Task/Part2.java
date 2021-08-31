package JavaCourse.javaJDBC.JBDC.Task;

import java.sql.*;

public class Part2 {

    private static final String URL = "jdbc:mysql://localhost:3306/myjoinsdb?serverTimezone=UTC";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "admin";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            System.out.println("Connecting to a selected database...");
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Connected database successfully...");
            statement = connection.createStatement();

            String sql = "select Name, DateOfBirt, TelefonNumber from Employeer " +
                    "join PersonalInformation " +
                    "on Employeer.PersonalInformation = PersonalInformation.PersonalInformationID " +
                    "where MaritalStatus = 'Не женат'";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String Name = resultSet.getString("Name");
                String DateOfBirt = resultSet.getString("DateOfBirt");
                String TelefonNumber = resultSet.getString("TelefonNumber");

                System.out.println(Name + " " + DateOfBirt + " " + TelefonNumber);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
