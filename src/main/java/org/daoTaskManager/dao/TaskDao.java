package org.daoTaskManager.dao;

import org.daoTaskManager.entity.Task;

import java.util.List;

public interface TaskDao {

    Task showTask();
    List<Task> showAllTasks();
    Task addTaskToDB();
    List<Task> addTasks();

}
