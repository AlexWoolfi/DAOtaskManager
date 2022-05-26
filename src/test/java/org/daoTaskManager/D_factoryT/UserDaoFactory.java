package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.UserDao;

public interface UserDaoFactory {
    UserDao createUserDao();
}
