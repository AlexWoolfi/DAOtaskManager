package org.daoTaskManager.abstractFactory.hibernateDao;

import org.apache.log4j.Logger;
import org.daoTaskManager.abstractFactory.dao.TaskDaoImpl;
import org.daoTaskManager.abstractFactory.dao.UserDaoImpl;
import org.daoTaskManager.abstractFactory.intrfacesForFactories.DaoFactory;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class HibernateDaoFactory implements DaoFactory {
    private static final Logger logger = Logger.getLogger(getCurrentClassName());
    @Override
    public Object createDaoObject(String daoType) {
        if (daoType.equals("User")) {
            logger.info("Was returned object UserDaoImpl from Hibernate");
            return new UserDaoImpl();
        } else if (daoType.equals("Task")) {
            logger.info("Was returned object TaskDaoImpl from Hibernate");
            return new TaskDaoImpl();
        } else {
            System.out.println("No object from Hibernate");
            logger.info("No object from Hibernate");
            return null;
        }
    }
}
