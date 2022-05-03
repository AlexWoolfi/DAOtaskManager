package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.dao.TaskDao;
import org.daoTaskManager.daoImplements.TaskDaoImpl;

public class TaskDaoFactoryImpl implements TaskDaoFactory {
    @Override
    public TaskDao createUserDao() {
        return new TaskDaoImpl();
    }
}
