package org.daoTaskManager.sevices;

import org.daoTaskManager.entity.Task;

import java.util.List;

public interface TaskService {
    void createTaskFromDB(String[]args);
    List<Task> getAllTasksFromDB();
    void showAllTasksOnUserID(String[] args);
}
