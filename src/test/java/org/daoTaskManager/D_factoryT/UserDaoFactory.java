package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.intrfacesForFactories.UserDao;

public interface UserDaoFactory {
    UserDao createUserDao();
}
