package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.abstractFactory.intrfacesForFactories.UserDao;
import org.daoTaskManager.abstractFactory.dao.UserDaoImpl;

public class UserDaoFactoryImpl implements UserDaoFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoImpl();
    }
}
