package org.blmodule.abstractFactory.jdbcDao;

import org.apache.log4j.Logger;
import org.blmodule.abstractFactory.dao.TaskDaoImpl;
import org.blmodule.abstractFactory.dao.UserDaoImpl;
import org.blmodule.abstractFactory.intrfacesForFactories.DaoFactory;

import static org.blmodule.utils.ClassNameUtil.getCurrentClassName;


public class JdbcDaoFactory implements DaoFactory {
    private static final Logger logger = Logger.getLogger(getCurrentClassName());
    @Override
    public Object createDaoObject(String daoType) {
        if (daoType.equals("User")) {
            logger.info("Was returned object UserDaoImpl from Jdbc");
            return new UserDaoImpl();
        } else if (daoType.equals("Task")) {
            logger.info("Was returned object TaskDaoImpl from Jdbc");
            return new TaskDaoImpl();
        } else {
            System.out.println("No object from Jdbc");
            logger.info("No object from Jdbc");
            return null;
        }
    }
}
