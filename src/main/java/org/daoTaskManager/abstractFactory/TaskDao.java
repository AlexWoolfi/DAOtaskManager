package org.daoTaskManager.abstractFactory;

import org.daoTaskManager.entity.Task;

import java.util.List;

public interface TaskDao {

    void addTaskToDB(String taskName, String taskBody, long id);

    List<Task> showTasksfromUnicUser(String USerunicName);

}
