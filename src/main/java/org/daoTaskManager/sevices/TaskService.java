package org.daoTaskManager.sevices;


import org.daoTaskManager.abstractFactory.TaskDao;

public interface TaskService {
    void createTaskFromDB(String[]args);

    void showAllTasksOnUserID(String[] args);
}
