package org.daoTaskManager.utils;


import org.apache.log4j.Logger;
import org.daoTaskManager.daoFactory.DaoFactoryImpl;
import org.daoTaskManager.servicesImpl.TaskServiceImpl;
import org.daoTaskManager.servicesImpl.UserServiceImpl;
import org.daoTaskManager.sevices.UserService;

import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;


public class ComandExecuter {
    static String s = new String();
    private static UserService userService = new UserServiceImpl();
    private static TaskServiceImpl taskService = new TaskServiceImpl();
    private static final Logger logger = Logger.getLogger(getCurrentClassName());


    public static void filtrFromArgs(String[] args) throws IOException {
        logger.info("ComandExecuter is started");
        for (int i = 0; i < args.length; i++) {
            s = Patterns.cleanWorldForFirstArgs(args[0]);
        }
        switch (s) {
            case "createUser":
                userService.createUser(args);
                logger.info("createUser is done");
                break;
            case "showAllUsers":
                userService.showAllUsers();
                logger.info("showAllUsers is done");
                break;
            case "addTask":
                taskService.createTaskFromDB(args);
                logger.info("addTask is done");
                break;
            case "showTasks":
                taskService.showAllTasksOnUserID(args);
                logger.info("showTasks is done");
                break;
            default:
                logger.info("Command not use, try again");

        }
    }

    static class MyFilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord record) {
            return false;
        }
    }

}

