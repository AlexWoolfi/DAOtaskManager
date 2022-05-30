package org.daoTaskManager.abstractFactory.hibernateDao;

import org.daoTaskManager.abstractFactory.intrfacesForFactories.TaskDao;
import org.daoTaskManager.entity.Task;
import org.hibernate.SessionFactory;

import java.util.List;

public class HibernateTaskDaoImpl implements TaskDao {
    private static SessionFactory sessionFactory;
    @Override
    public void addTaskToDB(String taskName, String taskBody, long id) {

    }

    @Override
    public List<Task> showTasksfromUnicUser(String USerunicName) {
        return null;
    }
}
