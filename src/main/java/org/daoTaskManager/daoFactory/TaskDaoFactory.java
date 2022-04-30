package org.daoTaskManager.daoFactory;

import org.daoTaskManager.dao.TaskDao;

public interface TaskDaoFactory {
    TaskDao createUserDao();
}
