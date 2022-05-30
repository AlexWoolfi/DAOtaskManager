package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.intrfacesForFactories.TaskDao;
import org.daoTaskManager.abstractFactory.dao.TaskDaoImpl;

public class TaskDaoFactoryImpl implements TaskDaoFactory {
    @Override
    public TaskDao createUserDao() {
        return new TaskDaoImpl();
    }
}
