package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.intrfacesForFactories.TaskDao;

public interface TaskDaoFactory {
    TaskDao createUserDao();
}
