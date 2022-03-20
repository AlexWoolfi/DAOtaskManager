package org.daoTaskManager.servicesImpl;

import org.daoTaskManager.dao.UserDao;
import org.daoTaskManager.daoInerface.UserDaoImpl;
import org.daoTaskManager.entity.User;
import org.daoTaskManager.sevices.UserService;
import org.daoTaskManager.utils.Patterns;

public class UserServiceImpl implements UserService {
    @Override
    public void createUser(String[] args) {
        User user = new User();
        user.setName(Patterns.cleanWorldArgs(args[1]));
        user.setLastName(Patterns.cleanWorldArgs(args[2]));
        user.setUserName(Patterns.cleanWorldArgs(args[3]));
        UserDao userDao = new UserDaoImpl();
        userDao.AddUserToDB(user.getName(),user.getLastName(),user.getUserName());
    }


}
