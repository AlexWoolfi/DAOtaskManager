package org.daoTaskManager.utils;


import org.apache.log4j.Logger;
import org.daoTaskManager.servicesImpl.TaskServiceImpl;
import org.daoTaskManager.servicesImpl.UserServiceImpl;
import org.daoTaskManager.sevices.UserService;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;


public class ComandExecuter {
    static String s = new String();
    private static UserService userService = new UserServiceImpl();
    private static TaskServiceImpl taskService = new TaskServiceImpl();
    private static final Logger userLogger = Logger.getLogger(getCurrentClassName());
//    private static LocalDateTime dt = LocalDateTime.now();

    public static void filtrFromArgs(String[] args) throws IOException {
        userLogger.info("ComandExecuter is started");
        for (int i = 0; i < args.length; i++) {
            s = Patterns.cleanWorldForFirstArgs(args[0]);
        }
        switch (s) {
            case "createUser":
                userService.createUser(args);
                break;
            case "showAllUsers":
                userService.showAllUsers();
                break;
            case "addTask":
                taskService.createTaskFromDB(args);
                break;
            case "showTasks":
                taskService.showAllTasksOnUserID(args);
                break;
            default:
                userLogger.info("Command not use, try again");

        }
    }
    static class MyFilter implements Filter {
        @Override
        public boolean isLoggable(LogRecord record) {
            return false;
        }
    }

}

