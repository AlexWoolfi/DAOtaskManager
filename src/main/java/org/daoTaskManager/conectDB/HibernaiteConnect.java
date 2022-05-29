package org.daoTaskManager.conectDB;

import org.daoTaskManager.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernaiteConnect {
    public static void main(String[] args) {
      SessionFactory sessionFactory = new Configuration()
              .addAnnotatedClass(User.class)
              .buildSessionFactory();
        Session session = null;
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        User user = new User();
//        user.setUserName("TestHibernaite");
//        user.setLastName("TestHibernaite2");
//        user.setName("TestHibernaite3");
//        session.save(user);
//        session.getTransaction().commit();

        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user = session.get(User.class,12l);
        user.setName("TestUpdate");
        session.update(user);
        session.getTransaction().commit();

      sessionFactory.close();
    }



}
