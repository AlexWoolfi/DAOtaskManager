package org.daoTaskManager.abstractFactory.jdbcDao;

import org.daoTaskManager.abstractFactory.intrfacesForFabrics.TaskDao;
import org.daoTaskManager.entity.Task;

import java.util.List;

public class JdbcTaskDaoImpl implements TaskDao {
    @Override
    public void addTaskToDB(String taskName, String taskBody, long id) {

    }

    @Override
    public List<Task> showTasksfromUnicUser(String USerunicName) {
        return null;
    }
}
