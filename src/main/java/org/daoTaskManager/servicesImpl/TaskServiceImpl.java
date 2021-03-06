package org.daoTaskManager.servicesImpl;

import org.apache.log4j.Logger;
import org.daoTaskManager.abstractFactory.intrfacesForFactories.TaskDao;
import org.daoTaskManager.abstractFactory.intrfacesForFactories.UserDao;
import org.daoTaskManager.abstractFactory.intrfacesForFactories.DaoFactory;
import org.daoTaskManager.abstractFactory.dao.DaoFactoryImpl;
import org.daoTaskManager.entity.Task;
import org.daoTaskManager.sevices.TaskService;
import org.daoTaskManager.utils.Patterns;

import java.util.ArrayList;
import java.util.List;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class TaskServiceImpl implements TaskService {
    Logger logger = Logger.getLogger(getCurrentClassName());
    private UserDao userDao;
    private TaskDao taskDao;

    public TaskServiceImpl() {
        DaoFactory factory = new DaoFactoryImpl();
        this.userDao = (UserDao) factory.createDaoObject("User");
        this.taskDao = (TaskDao) factory.createDaoObject("Task");
    }



    @Override
    public void showAllTasksOnUserID(String[] args) {
        String userName = Patterns.cleanWorldArgs(args[1]);
        List<Task> tasks = new ArrayList<>();
        tasks = taskDao.showTasksfromUnicUser(userName);
        for (Task t : tasks) {
            System.out.println("-------------------");
            System.out.println(t);
        }
        logger.info("Method showAllTasksOnUserID is done");
    }

    @Override
    public void createTaskFromDB(String[] args) {
        String username = Patterns.cleanWorldArgs(args[1]);
        String taskName = Patterns.cleanWorldArgs(args[2]);
        String taskBody = Patterns.cleanWorldArgs(args[3]);
        long userId = userDao.getUserid(username);

        taskDao.addTaskToDB(taskName, taskBody, userId);
        logger.info("Method createTaskFromDB is done");
    }


}
