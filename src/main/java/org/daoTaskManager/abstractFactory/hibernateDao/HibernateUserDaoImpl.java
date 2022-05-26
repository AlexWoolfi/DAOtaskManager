package org.daoTaskManager.abstractFactory.hibernateDao;

import org.daoTaskManager.abstractFactory.UserDao;
import org.daoTaskManager.entity.User;

import java.util.List;

public class HibernateUserDaoImpl implements UserDao {
    @Override
    public void AddUserToDB(String a, String b, String c) {

    }

    @Override
    public List<User> showAllusersFromDB() {
        return null;
    }

    @Override
    public long getUserid(String s) {
        return 0;
    }
}
