package org.daoTaskManager.D_factoryT;

import org.blmodule.abstractFactory.intrfacesForFactories.TaskDao;

public interface TaskDaoFactory {
    TaskDao createUserDao();
}
