package org.daoTaskManager;

import org.apache.log4j.Logger;
import org.daoTaskManager.abstractFactory.hibernateDao.HibernateUserDaoImpl;
import org.daoTaskManager.utils.ComandExecuter;
import java.io.IOException;
import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class App {
    private static final Logger logger = Logger.getLogger(getCurrentClassName());

    public static void main(String[] args) throws IOException {
//        logger.info("Main is starred");
//        ComandExecuter.filtrFromArgs(args);
        HibernateUserDaoImpl hibernateUserDao = new HibernateUserDaoImpl();
        hibernateUserDao.AddUserToDB("testHiberMethod","testHiberMethod","testHiberMethod1");


    }
}
