package org.blmodule;

import org.apache.log4j.Logger;
import org.blmodule.utils.ComandExecuter;

import java.io.IOException;

import static org.blmodule.utils.ClassNameUtil.getCurrentClassName;

/**
 * Hello world!
 *
 */
public class App {
        private static final Logger logger = Logger.getLogger(getCurrentClassName());

        public static void main(String[] args) throws IOException {
            logger.info("Main is starred");
            ComandExecuter.filtrFromArgs(args);
//        HibernateUserDaoImpl hibernateUserDao = new HibernateUserDaoImpl();
//        hibernateUserDao.AddUserToDB("testHiberMethod","testHiberMethod","testHiberMethod1");


        }
}
