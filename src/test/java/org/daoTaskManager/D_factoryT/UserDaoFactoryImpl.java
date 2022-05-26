package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.UserDao;
import org.daoTaskManager.abstractFactory.daoFactory.UserDaoImpl;

public class UserDaoFactoryImpl implements UserDaoFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoImpl();
    }
}
