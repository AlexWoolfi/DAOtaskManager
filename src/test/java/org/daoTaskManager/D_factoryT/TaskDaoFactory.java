package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.dao.TaskDao;

public interface TaskDaoFactory {
    TaskDao createUserDao();
}
