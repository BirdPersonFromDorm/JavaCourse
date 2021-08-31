package JavaCourse.javaJDBC.JBDC.Task;

import java.sql.*;

public class Part1 {
    private static final String URL = "jdbc:mysql://localhost:3306/myjoinsdb?serverTimezone=UTC";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "admin";


    public static void main(String[] args) {
        //registerDriver();

        Connection connection = null;
        Statement statement = null;

        try {
            System.out.println("Connecting to a selected database...");
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Connected database successfully...");
            statement = connection.createStatement();

            String sql = "select Name, TelefonNumber, City from Employeer " +
                    "join PersonalInformation " +
                    "on Employeer.PersonalInformation = PersonalInformation.PersonalInformationID";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String Name = resultSet.getString("Name");
                String TelefonNumber = resultSet.getString("TelefonNumber");
                String City = resultSet.getString("City");

                System.out.println(Name + " " + TelefonNumber + " " + City);
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
    private static void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
