package org.daoTaskManager.abstractFactory.hibernateDao;

import org.daoTaskManager.abstractFactory.intrfacesForFactories.TaskDao;
import org.daoTaskManager.entity.Task;

import java.util.List;

public class HibernateTaskDaoImpl implements TaskDao {
    @Override
    public void addTaskToDB(String taskName, String taskBody, long id) {

    }

    @Override
    public List<Task> showTasksfromUnicUser(String USerunicName) {
        return null;
    }
}
