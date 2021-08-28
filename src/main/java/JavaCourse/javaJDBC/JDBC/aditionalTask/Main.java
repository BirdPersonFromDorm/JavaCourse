package JavaCourse.javaJDBC.JDBC.aditionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Calendar;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/myjoinsdb?serverTimezone=UTC";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "admin";

    private static final String INSER_NEW = "INSERT INTO personalinformation(MaritalStatus, DateOfBirt, City) "
            + " VALUES(?,?,?)";

    public static void main(String[] args) throws IOException {
        registerDriver();
        addNewInfo();

    }

    private static void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static void addNewInfo() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter MaritalStatus");
        String MaritalStatus = reader.readLine();
        System.out.println("Enter City");
        String City = reader.readLine();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.prepareStatement(INSER_NEW);

            statement.setString(1, MaritalStatus);
            statement.setDate(2, new Date(Calendar.getInstance().getTimeInMillis()));
            statement.setString(3, City);

            statement.execute();

        } catch (SQLException  e) {
            e.printStackTrace();
        }  finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
