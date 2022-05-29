package org.daoTaskManager.conectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
    static final String DB_URL = "jdbc:postgresql://localhost:5050/TaskManager";
    static final String USER = "postgres";
    static final String PASS = "Woolfi504";


    public static Connection startConnection() {
        Connection con = null;
        try{
            con = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
}
