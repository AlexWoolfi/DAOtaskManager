package org.daoTaskManager.daoImplements;

import org.daoTaskManager.conectDB.SingeltonToDb;
import org.daoTaskManager.dao.UserDao;
import org.daoTaskManager.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public long getUserid(String s) {
        long id;
        User user = new User();
        String query = "SELECT * FROM users WHERE userunicname = ?";
        String nameParam = s;
        try {
            Connection connection = SingeltonToDb.connectSingleToBD();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,nameParam);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setId(resultSet.getLong(1));
                user.setName(resultSet.getString(2));
                user.setLastName(resultSet.getString(3));
                user.setUserName(resultSet.getString(4));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        id = user.getId();
        return id;
    }

    @Override
    public List<User> showAllusersFromDB() {
        String showAllusersQuery = "SELECT * FROM users";
        List<User> users = new ArrayList<>();
        try{
            Connection connection = SingeltonToDb.connectSingleToBD();
            PreparedStatement preparedStatement = connection.prepareStatement(showAllusersQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                long id = resultSet.getLong(1);
                String name = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String UnicName = resultSet.getString(3);
                users.add(new User(id,name,lastName,UnicName));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.err.format("SQL state: %\n%", throwables.getSQLState(), throwables.getMessage());

        }

        return users;
    }

    @Override
    public  void AddUserToDB(String user_name,String user_lastname,String user_unicname) {
        String insertNewUser = "INSERT INTO users (username,userlastname,userunicname) VALUES (?,?,?)";
        String userName = user_name;
        String userLastname = user_lastname;
        String userUnicname = user_unicname;

        try {
            Connection connection = SingeltonToDb.connectSingleToBD();
            PreparedStatement preparedStatement = connection.prepareStatement(insertNewUser);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,userLastname);
            preparedStatement.setString(3,userUnicname);
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.err.format("SQL State: %s\n%s", throwables.getSQLState(), throwables.getMessage());
        }
    }
}
