package org.daoTaskManager.abstractFactory.dao;


import org.apache.log4j.Logger;
import org.daoTaskManager.abstractFactory.intrfacesForFabrics.DaoFactory;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class DaoFactoryImpl implements DaoFactory {
    private static final Logger logger = Logger.getLogger(getCurrentClassName());

    @Override
    public Object createDaoObject(String daoType) {
        if (daoType.equals("User")) {
            logger.info("Was returned object UserDaoImpl");
            return new UserDaoImpl();
        } else if (daoType.equals("Task")) {
            logger.info("Was returned object TaskDaoImpl");
            return new TaskDaoImpl();
        } else {
            System.out.println("No object");
            logger.info("No object");
            return null;
        }
    }
}

