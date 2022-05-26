package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.TaskDao;
import org.daoTaskManager.abstractFactory.daoFactory.TaskDaoImpl;

public class TaskDaoFactoryImpl implements TaskDaoFactory {
    @Override
    public TaskDao createUserDao() {
        return new TaskDaoImpl();
    }
}
