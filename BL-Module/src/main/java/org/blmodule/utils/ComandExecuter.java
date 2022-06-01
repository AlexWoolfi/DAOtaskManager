package org.blmodule.utils;


import org.apache.log4j.Logger;
import org.blmodule.servicesImpl.TaskServiceImpl;
import org.blmodule.servicesImpl.UserServiceImpl;
import org.blmodule.sevices.UserService;


import java.io.IOException;

import static org.blmodule.utils.ClassNameUtil.getCurrentClassName;


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

}

