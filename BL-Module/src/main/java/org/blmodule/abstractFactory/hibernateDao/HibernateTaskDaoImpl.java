package org.blmodule.abstractFactory.hibernateDao;


import org.blmodule.abstractFactory.intrfacesForFactories.TaskDao;
import org.blmodule.entity.Task;
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
