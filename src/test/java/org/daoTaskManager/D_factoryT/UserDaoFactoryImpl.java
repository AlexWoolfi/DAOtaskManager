package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.dao.UserDao;
import org.daoTaskManager.daoImplements.UserDaoImpl;

public class UserDaoFactoryImpl implements UserDaoFactory {
    @Override
    public UserDao createUserDao() {
        return new UserDaoImpl();
    }
}
