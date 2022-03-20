package org.daoTaskManager.utils;


import org.daoTaskManager.servicesImpl.UserServiceImpl;
import org.daoTaskManager.sevices.UserService;

import java.io.IOException;




public class ComandExecuter {
    static String s = new String();


    public static void filtrFromArgs(String[] args) throws IOException {
        for (int i = 0; i < args.length; i++) {
            s = Patterns.cleanWorldForFirstArgs(args[0]);
        }
        switch (s) {
            case "createUser":
                System.out.println("Ok create");
                UserService userService = new UserServiceImpl();
                userService.createUser(args);
                break;
            case "showAllUsers":
                System.out.println("showAllUsers");

                break;
            case "addTask":
                System.out.println("addTask");

                break;
            case "showTasks":
                System.out.println("showTasks");

                break;
            default:
                System.out.println("Command not use, try again");

        }
    }

}

