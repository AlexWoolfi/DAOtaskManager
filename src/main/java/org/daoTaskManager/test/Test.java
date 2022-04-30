package org.daoTaskManager.test;

import org.daoTaskManager.dao.TaskDao;
import org.daoTaskManager.daoFactory.TaskDaoFactory;
import org.daoTaskManager.daoFactory.TaskDaoFactoryImpl;

public class Test {
    public static void main(String[] args) {
        TaskDaoFactory taskDaoFactory = new TaskDaoFactoryImpl();
        TaskDao taskDao = taskDaoFactory.createUserDao();
        taskDao.showTasksfromUnicUser("Test1");
    }
}
