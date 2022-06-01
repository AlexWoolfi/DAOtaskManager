package org.daoTaskManager.D_factoryT;

import org.blmodule.abstractFactory.intrfacesForFactories.UserDao;
import org.blmodule.abstractFactory.dao.UserDaoImpl;

public class UserDaoFactoryImpl implements UserDaoFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoImpl();
    }
}
