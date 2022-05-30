package org.daoTaskManager.abstractFactory.jdbcDao;

import org.daoTaskManager.abstractFactory.intrfacesForFactories.UserDao;
import org.daoTaskManager.entity.User;

import java.util.List;

public class JdbcUserDaoImpl implements UserDao {
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
