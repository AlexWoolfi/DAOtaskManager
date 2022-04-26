package org.daoTaskManager.servicesImpl;

import org.daoTaskManager.dao.TaskDao;
import org.daoTaskManager.dao.UserDao;
import org.daoTaskManager.daoImplements.TaskDaoImpl;
import org.daoTaskManager.daoImplements.UserDaoImpl;
import org.daoTaskManager.entity.Task;
import org.daoTaskManager.sevices.TaskService;
import org.daoTaskManager.utils.Patterns;

import java.util.ArrayList;
import java.util.List;

public class TaskServiceImpl implements TaskService {

    @Override
    public void showAllTasksOnUserID(String[] args) {
        String userName = Patterns.cleanWorldArgs(args[1]);
        TaskDao taskDao = new TaskDaoImpl();
        List<Task> tasks = new ArrayList<>();
        tasks = taskDao.showTasksfromUnicUser(userName);
        for (Task t : tasks) {
            System.out.println("-------------------");
            System.out.println(t);
        }
    }

    @Override
    public void createTaskFromDB(String[] args) {
        UserDao userDao = new UserDaoImpl();
        TaskDao taskDao = new TaskDaoImpl();

        String username = Patterns.cleanWorldArgs(args[1]);
        String taskName = Patterns.cleanWorldArgs(args[2]);
        String taskBody = Patterns.cleanWorldArgs(args[3]);
        long userId = userDao.getUserid(username);

        taskDao.addTaskToDB(taskName, taskBody, userId);

    }


}
