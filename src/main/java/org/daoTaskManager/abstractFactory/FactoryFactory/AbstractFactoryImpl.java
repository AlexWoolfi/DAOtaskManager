package org.daoTaskManager.abstractFactory.FactoryFactory;

import org.apache.log4j.Logger;
import org.daoTaskManager.abstractFactory.intrfacesForFabrics.AbstractFactory;
import org.daoTaskManager.abstractFactory.dao.DaoFactoryImpl;
import org.daoTaskManager.abstractFactory.intrfacesForFabrics.DaoFactory;
import org.daoTaskManager.abstractFactory.hibernateDao.HibernateDaoFactory;
import org.daoTaskManager.abstractFactory.jdbcDao.JdbcDaoFactory;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class AbstractFactoryImpl implements AbstractFactory {
    private static final Logger logger = Logger.getLogger(getCurrentClassName());
    @Override
    public Object getFactory(String typeOfFactory) {
        if(typeOfFactory.equals("DAO")) {
            DaoFactory daoFactory = new DaoFactoryImpl();
            return daoFactory;
        } else if(typeOfFactory.equals("JDBC")) {
            DaoFactory daoFactory = new JdbcDaoFactory();
            return daoFactory;
        } else if(typeOfFactory.equals("HIBERNATE")) {
            DaoFactory daoFactory = new HibernateDaoFactory();
            return daoFactory;
    }else {
            System.out.println("No object");
            logger.info("No object");
            return null;
        }
}
}
