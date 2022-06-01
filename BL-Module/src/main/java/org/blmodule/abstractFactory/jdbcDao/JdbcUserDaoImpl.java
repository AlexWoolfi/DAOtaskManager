package org.blmodule.abstractFactory.jdbcDao;



import org.blmodule.entity.User;
import org.blmodule.abstractFactory.intrfacesForFactories.UserDao;

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
