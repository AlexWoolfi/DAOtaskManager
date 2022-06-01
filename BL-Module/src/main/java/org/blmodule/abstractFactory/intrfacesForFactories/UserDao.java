package org.blmodule.abstractFactory.intrfacesForFactories;

import org.blmodule.entity.User ;

import java.util.List;

public interface UserDao  {

    void AddUserToDB(String a, String b, String c);

    List<User> showAllusersFromDB();

    long getUserid(String s);
}
