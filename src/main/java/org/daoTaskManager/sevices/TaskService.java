package org.daoTaskManager.sevices;



public interface TaskService {
    void createTaskFromDB(String[]args);

    void showAllTasksOnUserID(String[] args);
}
