package org.daoTaskManager.abstractFactory.dao;

import org.apache.log4j.Logger;
import org.daoTaskManager.conectDB.SingeltonToDb;
import org.daoTaskManager.abstractFactory.intrfacesForFabrics.TaskDao;
import org.daoTaskManager.abstractFactory.intrfacesForFabrics.UserDao;
import org.daoTaskManager.entity.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class TaskDaoImpl implements TaskDao {
    private static final Logger logger = Logger.getLogger(getCurrentClassName());

    @Override
    public List<Task> showTasksfromUnicUser(String s) {
        UserDao userDao = new UserDaoImpl();
        String unicUserName = s;
        List<Task> tasks = new ArrayList<>();
        String query = "SELECT * FROM tasks WHERE fk_userid = ?";
        long id = userDao.getUserid(unicUserName);
        try {
            Connection connection = SingeltonToDb.connectSingleToBD();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setLong(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                long idTask = resultSet.getLong(1);
                String taskName = resultSet.getString(2);
                String taskBody = resultSet.getString(3);
                long idUser = resultSet.getLong(4);
                tasks.add(new Task(idTask, taskName, taskBody, idUser));
            }
            logger.debug("The connection from method \"showTasksfromUnicUser\"  was successful");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            logger.error("Connection from method \"showTasksfromUnicUser\" failed");
        }
        return tasks;
    }

    @Override
    public void addTaskToDB(String taskName, String taskBody, long id) {
        String insertNewTASK =
                "CREATE TABLE IF NOT EXISTS tasks" +
                        "(id SERIAL PRIMARY KEY NOT NULL," +
                        "taskName VARCHAR(56) NOT NULL," +
                        "taskBody text NOT NULL," +
                        "fk_userid int REFERENCES users(id));" +
                        " INSERT INTO tasks (taskName,taskBody,fk_userid) VALUES (?,?,?)";
        try {
            Connection connection = SingeltonToDb.connectSingleToBD();
            PreparedStatement preparedStatement = connection.prepareStatement(insertNewTASK);
            preparedStatement.setString(1, taskName);
            preparedStatement.setString(2, taskBody);
            preparedStatement.setLong(3, id);
            preparedStatement.executeUpdate();
            logger.debug("The connection from method \"addTaskToDB\"  was successful");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            logger.error("Connection from method \"addTaskToDB\" failed");
        }

    }

}
