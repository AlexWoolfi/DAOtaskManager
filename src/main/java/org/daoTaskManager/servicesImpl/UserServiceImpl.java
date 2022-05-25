package org.daoTaskManager.servicesImpl;

import org.apache.log4j.Logger;
import org.daoTaskManager.dao.UserDao;

import org.daoTaskManager.daoFactory.DaoFactory;
import org.daoTaskManager.daoFactory.DaoFactoryImpl;
import org.daoTaskManager.daoImplements.UserDaoImpl;
import org.daoTaskManager.entity.User;
import org.daoTaskManager.sevices.UserService;
import org.daoTaskManager.utils.Patterns;

import java.util.List;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class UserServiceImpl implements UserService {
    Logger logger = Logger.getLogger(getCurrentClassName());
   private static final DaoFactory daoFactory = new DaoFactoryImpl();
   private String className = getCurrentClassName();

    @Override
    public void createUser(String[] args) {
        User user = new User();
        user.setName(Patterns.cleanWorldArgs(args[1]));
        user.setLastName(Patterns.cleanWorldArgs(args[2]));
        user.setUserName(Patterns.cleanWorldArgs(args[3]));

//        String className = getCurrentClassName();
        UserDao userDao = (UserDao) daoFactory.createDaoObject(className);
        userDao.AddUserToDB(user.getName(), user.getLastName(), user.getUserName());
        logger.info("Was got data from configuration, method createUser");
    }

    @Override
    public void showAllUsers() {
        String className = getCurrentClassName();
        UserDao userDao = (UserDao) daoFactory.createDaoObject(className);
        List<User> users = userDao.showAllusersFromDB();
        for (User u : users) {
            System.out.println("----------------------------------");
            System.out.println(u);
        }
        logger.info("The method \"showAllUsers\"");
    }

}
