package JavaCourse.javaJDBC.JBDC2.additionalTask.dao;

import JavaCourse.javaJDBC.JBDC2.additionalTask.entity.PostOfEmployee;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class PostOfEmployeeDAO implements IPostOfEmployee{

    @Override
    public void add(PostOfEmployee postOfEmployee) {
        Connection connection = null;
        connection = getConnection();
        PreparedStatement preparedStatement = null;

        try{
            preparedStatement = connection.prepareStatement("INSERT INTO postofemployee(post, salary) VALUES (?, ?)");
            preparedStatement.setString(1, postOfEmployee.getPost());
            preparedStatement.setDouble(2, postOfEmployee.getSalary());
            preparedStatement.execute();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (connection != null && preparedStatement != null) {
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public PostOfEmployee getById(int id) {
        Connection connection = null;
        connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("SELECT post, salary FROM postofemployee " +
                    "WHERE PostOfEmployeeID = ? ");
            preparedStatement.setInt(1, id);

            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            String post = rs.getString(1);
            double salary = rs.getDouble(2);
            PostOfEmployee postOfEmployee = new PostOfEmployee();
            postOfEmployee.setPost(post);
            postOfEmployee.setSalary(salary);

            return postOfEmployee;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null) {
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    @Override
    public void updatePrice(String post, double salary) {
        Connection connection;
        connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("UPDATE postofemployee SET post = ? WHERE salary = ?");
            preparedStatement.setString(1, post);
            preparedStatement.setDouble(2, salary);

            int updatedValues = preparedStatement.executeUpdate();
            System.out.println("Values updated: " + updatedValues);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null) {
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void remove(String post) {
        Connection connection = null;
        connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("DELETE FROM postofemployee WHERE post = ? ");
            preparedStatement.setString(1, post);

            int deletedValues = preparedStatement.executeUpdate();
            System.out.println("Values deleted: " + deletedValues);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null && preparedStatement != null) {
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<PostOfEmployee> getAllWherePostIs(String post) {
        List<PostOfEmployee> allPostOfEmployee = new ArrayList<>();
        Connection connection = null;
        connection = getConnection();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement("SELECT postofemployeeid,post,salary FROM postofemployee" +
                        " WHERE post = ?");
            preparedStatement.setString(1, post);

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                long postOfEmployeeID = rs.getLong(1);
                String postOfTable = rs.getString(2);
                double salary = rs.getDouble(3);
                PostOfEmployee postOfEmployee = new PostOfEmployee();
                postOfEmployee.setPostOfEmployeeID(postOfEmployeeID);
                postOfEmployee.setPost(postOfTable);
                postOfEmployee.setSalary(salary);
                allPostOfEmployee.add(postOfEmployee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (connection != null && preparedStatement != null) {
                try {
                    connection.close();
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return allPostOfEmployee;
    }

    private Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjoinsdb", "root", "admin");
            return connection;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
