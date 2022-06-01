package org.blmodule.servicesImpl;

import org.apache.log4j.Logger;

import org.blmodule.entity.User;
import org.blmodule.sevices.UserService;
import org.blmodule.abstractFactory.dao.DaoFactoryImpl;
import org.blmodule.abstractFactory.intrfacesForFactories.DaoFactory;
import org.blmodule.abstractFactory.intrfacesForFactories.UserDao;
import org.blmodule.utils.Patterns;

import java.util.List;

import static org.blmodule.utils.ClassNameUtil.getCurrentClassName;


public class UserServiceImpl implements UserService {
    Logger logger = Logger.getLogger(getCurrentClassName());
   private UserDao userDao;

    public UserServiceImpl() {
        DaoFactory factory = new DaoFactoryImpl();
        this.userDao = (UserDao) factory.createDaoObject("User");
    }


    @Override
    public void createUser(String[] args) {
        User user = new User();
        user.setName(Patterns.cleanWorldArgs(args[1]));
        user.setLastName(Patterns.cleanWorldArgs(args[2]));
        user.setUserName(Patterns.cleanWorldArgs(args[3]));
        userDao.AddUserToDB(user.getName(), user.getLastName(), user.getUserName());
        logger.info("Was got data from configuration, method createUser");
    }

    @Override
    public void showAllUsers() {
        List<User> users = userDao.showAllusersFromDB();
        for (User u : users) {
            System.out.println("----------------------------------");
            System.out.println(u);
        }
        logger.info("The method \"showAllUsers\"");
    }

}
