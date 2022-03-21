package org.daoTaskManager.dao;

import org.daoTaskManager.entity.User;

import java.util.List;

public interface UserDao {

     void AddUserToDB(String a, String b, String c);
     List<User> showAllusersFromDB();

     long getUserid(String s);
}
