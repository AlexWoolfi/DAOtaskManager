package org.daoTaskManager.D_factoryT;

import org.blmodule.abstractFactory.intrfacesForFactories.TaskDao;
import org.blmodule.abstractFactory.dao.TaskDaoImpl;

public class TaskDaoFactoryImpl implements TaskDaoFactory {
    @Override
    public TaskDao createUserDao() {
        return new TaskDaoImpl();
    }
}
