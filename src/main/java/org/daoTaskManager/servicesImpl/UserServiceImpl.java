package org.daoTaskManager.servicesImpl;

import org.daoTaskManager.dao.UserDao;
import org.daoTaskManager.daoImplements.UserDaoImpl;
import org.daoTaskManager.entity.User;
import org.daoTaskManager.sevices.UserService;
import org.daoTaskManager.utils.Patterns;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void createUser(String[] args) {
        User user = new User();
        user.setName(Patterns.cleanWorldArgs(args[1]));
        user.setLastName(Patterns.cleanWorldArgs(args[2]));
        user.setUserName(Patterns.cleanWorldArgs(args[3]));
        UserDao userDao = new UserDaoImpl();
        userDao.AddUserToDB(user.getName(), user.getLastName(), user.getUserName());
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
    }
}
