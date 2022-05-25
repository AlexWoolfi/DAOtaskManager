package org.daoTaskManager.servicesImpl;

import org.apache.log4j.Logger;
import org.daoTaskManager.dao.TaskDao;
import org.daoTaskManager.dao.UserDao;
import org.daoTaskManager.daoFactory.DaoFactory;
import org.daoTaskManager.daoFactory.DaoFactoryImpl;
import org.daoTaskManager.daoImplements.TaskDaoImpl;
import org.daoTaskManager.daoImplements.UserDaoImpl;
import org.daoTaskManager.entity.Task;
import org.daoTaskManager.sevices.TaskService;
import org.daoTaskManager.utils.Patterns;

import java.util.ArrayList;
import java.util.List;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class TaskServiceImpl implements TaskService {
    Logger logger = Logger.getLogger(getCurrentClassName());
    private static final DaoFactory daoFactory = new DaoFactoryImpl();
    private String className = getCurrentClassName();
    @Override
    public void showAllTasksOnUserID(String[] args) {
        String userName = Patterns.cleanWorldArgs(args[1]);
        TaskDao taskDao = (TaskDao) daoFactory.createDaoObject(className);
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
        UserDao userDao = (UserDao) daoFactory.createDaoObject("UserServiceImpl");
        TaskDao taskDao = (TaskDao) daoFactory.createDaoObject(className);

        String username = Patterns.cleanWorldArgs(args[1]);
        String taskName = Patterns.cleanWorldArgs(args[2]);
        String taskBody = Patterns.cleanWorldArgs(args[3]);
        long userId = userDao.getUserid(username);

        taskDao.addTaskToDB(taskName, taskBody, userId);
        logger.info("Method createTaskFromDB is done");
    }


}
