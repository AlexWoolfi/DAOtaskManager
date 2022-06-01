package org.blmodule.abstractFactory.factoryFactory;

import org.apache.log4j.Logger;
import org.blmodule.abstractFactory.intrfacesForFactories.AbstractFactory;
import org.blmodule.abstractFactory.intrfacesForFactories.DaoFactory;
import org.blmodule.abstractFactory.dao.DaoFactoryImpl;
import org.blmodule.abstractFactory.hibernateDao.HibernateDaoFactory;
import org.blmodule.abstractFactory.jdbcDao.JdbcDaoFactory;

import static org.blmodule.utils.ClassNameUtil.getCurrentClassName;


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
