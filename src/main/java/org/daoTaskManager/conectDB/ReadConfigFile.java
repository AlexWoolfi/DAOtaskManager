package org.daoTaskManager.conectDB;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {
    public static void main(String[] args) {
        try(InputStream inputStream = new FileInputStream("src/main/resources/config.properties")) {
            Properties prop = new Properties();
            prop.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
