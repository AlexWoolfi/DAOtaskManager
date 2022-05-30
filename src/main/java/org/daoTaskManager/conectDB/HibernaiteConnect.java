package org.daoTaskManager.conectDB;

import org.daoTaskManager.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernaiteConnect {
  private static SessionFactory sessionFactory = buildSessionFactory();

  protected static SessionFactory buildSessionFactory() {
    final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
            .configure()
            .build();
    try {
      sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    }
    catch (Exception e) {
      StandardServiceRegistryBuilder.destroy( registry );

      throw new ExceptionInInitializerError("Initial SessionFactory failed" + e);
    }
    return sessionFactory;
  }

  public static SessionFactory getSessionFactory() {
    return sessionFactory;
  }

  public static void shutdown() {
    getSessionFactory().close();
  }

//    public static void main(String[] args) {
//      SessionFactory sessionFactory = new Configuration()
//              .addAnnotatedClass(User.class)
//              .buildSessionFactory();
//        Session session = null;
////        session = sessionFactory.getCurrentSession();
////        session.beginTransaction();
////        User user = new User();
////        user.setUserName("TestHibernaite");
////        user.setLastName("TestHibernaite2");
////        user.setName("TestHibernaite3");
////        session.save(user);
////        session.getTransaction().commit();
//
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        User user = session.get(User.class,12l);
//        user.setName("TestUpdate");
//        session.update(user);
//        session.getTransaction().commit();
//
//      sessionFactory.close();
//    }



}
