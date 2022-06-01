package org.daoTaskManager.D_factoryT;

import org.blmodule.abstractFactory.intrfacesForFactories.UserDao;

public interface UserDaoFactory {
    UserDao createUserDao();
}
