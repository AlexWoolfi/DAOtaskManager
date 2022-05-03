package org.daoTaskManager.D_factoryT;

import org.daoTaskManager.dao.UserDao;

public interface UserDaoFactory {
    UserDao createUserDao();
}
