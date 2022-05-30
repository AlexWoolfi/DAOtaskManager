package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.intrfacesForFabrics.UserDao;

public interface UserDaoFactory {
    UserDao createUserDao();
}
