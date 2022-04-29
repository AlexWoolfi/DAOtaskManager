package org.daoTaskManager.servicesImpl;

import org.apache.log4j.Logger;
import org.daoTaskManager.dao.UserDao;
import org.daoTaskManager.daoImplements.UserDaoImpl;
import org.daoTaskManager.entity.User;
import org.daoTaskManager.sevices.UserService;
import org.daoTaskManager.utils.Patterns;

import java.util.ArrayList;
import java.util.List;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class UserServiceImpl implements UserService {
    Logger logger = Logger.getLogger(getCurrentClassName());
    @Override
    public void createUser(String[] args) {
        User user = new User();
        user.setName(Patterns.cleanWorldArgs(args[1]));
        user.setLastName(Patterns.cleanWorldArgs(args[2]));
        user.setUserName(Patterns.cleanWorldArgs(args[3]));
        UserDao userDao = new UserDaoImpl();
        userDao.AddUserToDB(user.getName(), user.getLastName(), user.getUserName());
        logger.info("Was got data from configuration, method createUser");
    }

    @Override
    public void showAllUsers() {
        UserDao userDao = new UserDaoImpl();
        List<User> users = new ArrayList<>();
        users = userDao.showAllusersFromDB();
        for (User u : users) {
            System.out.println("----------------------------------");
            System.out.println(u);
        }
        logger.info("The method \"showAllUsers\"");
    }
}
