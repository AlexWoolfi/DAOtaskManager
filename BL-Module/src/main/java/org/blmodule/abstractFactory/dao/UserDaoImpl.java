package org.blmodule.abstractFactory.dao;

import org.apache.log4j.Logger;

import org.blmodule.entity.User;
import org.blmodule.abstractFactory.intrfacesForFactories.UserDao;
import org.daoTaskManager.conectDB.SingeltonToDb;
import org.postgresql.util.PSQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import static org.blmodule.utils.ClassNameUtil.getCurrentClassName;


public class UserDaoImpl implements UserDao {
    private static final Logger logger = Logger.getLogger(getCurrentClassName());

    @Override
    public long getUserid(String s) {
        long id;
        org.blmodule.entity.User user = new User();
        String query = "SELECT * FROM users WHERE userunicname = ?";
        String nameParam = s;
        try {
            Connection connection = SingeltonToDb.connectSingleToBD();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, nameParam);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user.setId(resultSet.getLong(1));
                user.setName(resultSet.getString(2));
                user.setLastName(resultSet.getString(3));
                user.setUserName(resultSet.getString(4));
            }
            logger.debug("The connection from method \"getUserid\"  was successful");
        } catch (SQLException exception) {
            exception.getMessage();
            logger.error("Connection from method \"getUserid\" failed");
        }
        id = user.getId();
        logger.debug("User ID was received from method \"getUserid\"  was successful" + id);
        return id;
    }

    @Override
    public List<org.blmodule.entity.User> showAllusersFromDB() {
        String showAllusersQuery = "SELECT * FROM users";
        List<User> users = new ArrayList<>();
        try {
            Connection connection = SingeltonToDb.connectSingleToBD();
            PreparedStatement preparedStatement = connection.prepareStatement(showAllusersQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                long id = resultSet.getLong(1);
                String name = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String UnicName = resultSet.getString(3);
                users.add(new User(id, name, lastName, UnicName));
            }
            logger.debug("The connection from method \"showAllusersFromDB\"  was successful");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            logger.error("Connection from method \"getUserid\" failed");
        }
        return users;
    }

    @Override
    public void AddUserToDB(String user_name, String user_lastname, String user_unicname) {
        String insertNewUser = "INSERT INTO users (username,userlastname,userunicname) VALUES (?,?,?)";
        String userName = user_name;
        String userLastname = user_lastname;
        String userUnicname = user_unicname;

        try {
            Connection connection = SingeltonToDb.connectSingleToBD();
            PreparedStatement preparedStatement = connection.prepareStatement(insertNewUser);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, userLastname);
            preparedStatement.setString(3, userUnicname);
            preparedStatement.executeUpdate();

        } catch (PSQLException psqlException) {
            psqlException.getMessage();
            logger.error("Connection from method \"AddUserToDB\" failed" + psqlException);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
            logger.error("Connection from method \"AddUserToDB\" failed" + throwables);
        }

    }
}

