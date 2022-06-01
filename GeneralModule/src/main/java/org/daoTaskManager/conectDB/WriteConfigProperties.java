package org.daoTaskManager.conectDB;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class WriteConfigProperties {
    public static void main(String[] args) {
        try(OutputStream stream = new FileOutputStream("src/main/resources/config.properties")) {
            Properties properties = new Properties();
            properties.setProperty("db.url","jdbc:postgresql://localhost:5050/TaskManager");
            properties.setProperty("db.user","postgres");
            properties.setProperty("db.password","Woolfi504");

            properties.store(stream,null);
            System.out.println(properties);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
