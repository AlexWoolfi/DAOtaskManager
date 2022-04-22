package org.daoTaskManager.utils;


import org.daoTaskManager.App;
import org.daoTaskManager.servicesImpl.TaskServiceImpl;
import org.daoTaskManager.servicesImpl.UserServiceImpl;
import org.daoTaskManager.sevices.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.LocalDateTime;


public class ComandExecuter {
    static String s = new String();
    private static UserService userService = new UserServiceImpl();
    private static TaskServiceImpl taskService = new TaskServiceImpl();
    private static final Logger userLogger = LoggerFactory.getLogger(ComandExecuter.class);
    private static LocalDateTime dt = LocalDateTime.now();

    public static void filtrFromArgs(String[] args) throws IOException {
        userLogger.info("ComandExecuter is started");
        for (int i = 0; i < args.length; i++) {
            s = Patterns.cleanWorldForFirstArgs(args[0]);
        }
        switch (s) {
            case "createUser":
                System.out.println("Ok create");
                userService.createUser(args);
                break;
            case "showAllUsers":
                userLogger.info("-------------------");
                userLogger.info("ShowAllUsers {}",dt);
                userService.showAllUsers();
                break;
            case "addTask":
                System.out.println("addTask");
                taskService.createTaskFromDB(args);
                break;
            case "showTasks":
                System.out.println("showTasks");
                taskService.showAllTasksOnUserID(args);
                break;
            default:
                System.out.println("Command not use, try again");

        }
    }

}

