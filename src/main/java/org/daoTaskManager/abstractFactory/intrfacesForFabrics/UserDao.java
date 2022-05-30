package org.daoTaskManager.abstractFactory.intrfacesForFabrics;

import org.daoTaskManager.entity.User;
import org.postgresql.util.PSQLException;

import java.util.List;

public interface UserDao  {

    void AddUserToDB(String a, String b, String c);

    List<User> showAllusersFromDB();

    long getUserid(String s);
}
