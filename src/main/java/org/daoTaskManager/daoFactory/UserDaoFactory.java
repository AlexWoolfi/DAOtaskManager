package org.daoTaskManager.daoFactory;

import org.daoTaskManager.dao.UserDao;

public interface UserDaoFactory {
    UserDao createUserDao();
}
