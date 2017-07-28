package mybatis.services.User;

import mybatis.mappers.User.UserMapper;
import mybatis.model.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by nicola on 7/24/17.
 */

@Service
public class UserService {

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    @Autowired
    UserMapper userMapper;

    public ArrayList<User> getAllUsers(){
        return userMapper.getAllUsers();
    }

    public User getById(int id){
        return userMapper.getById(id);
    }

    public ArrayList<User> getAllUsersManually() {

        ArrayList<User> users = new ArrayList<>();

        try {
            // Setup the connection with the DB
            connection = getConnection();

            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("SELECT * FROM Users");

            //catching any exceptions

            while (resultSet.next()) {

                // creating an object to to set the parameters of the columns
                User u = new User();

                // setting the parameters of the variables that are being called in the query
                u.setId(resultSet.getInt("id"));
                u.setFirst_name(resultSet.getString("first_name"));
                u.setLast_name(resultSet.getString("last_name"));
                u.setEmail(resultSet.getString("email"));
                u.setIsActive(resultSet.getInt("isActive"));

                // adding the objects to the ArrayList
                users.add(u);
            }

        } catch (NullPointerException npe) {
            npe.printStackTrace();
        } catch (SQLException se) {
                se.printStackTrace();
        }
            return users;
    }


    private Connection getConnection() {

        try{
            System.out.println("Creating connection...");
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost?" +
                    "user=root&password=Coding!23&useSSL=false");
            System.out.println("Connection succeeded...");
        } catch (ClassNotFoundException cnf){
            cnf.printStackTrace();
        } catch (SQLException se){
            se.printStackTrace();
        }
        return connection;
    }


    public User addNew(User user) {
        int x = userMapper.insertUser(user);
        return userMapper.getByEmail(user.getEmail());
    }

    public User updateById(User user) {
        int x = userMapper.updateUser(user);
        return user;
    }

    public int deleteById(int id) {
        int x = userMapper.deleteUser(id);
        return x;
    }

}


