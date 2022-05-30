package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.intrfacesForFabrics.TaskDao;

public interface TaskDaoFactory {
    TaskDao createUserDao();
}
