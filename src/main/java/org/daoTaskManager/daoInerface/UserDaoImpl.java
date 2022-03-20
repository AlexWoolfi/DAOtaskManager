package org.daoTaskManager.daoInerface;

import org.daoTaskManager.conectDB.SingeltonToDb;
import org.daoTaskManager.dao.UserDao;
import org.daoTaskManager.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
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
