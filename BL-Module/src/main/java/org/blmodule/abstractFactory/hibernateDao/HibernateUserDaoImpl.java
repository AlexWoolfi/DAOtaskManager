//package org.blmodule.abstractFactory.hibernateDao;
//
//
//import org.blmodule.entity.User;
//import org.blmodule.abstractFactory.intrfacesForFactories.UserDao;
//import org.daoTaskManager.conectDB.HibernaiteConnect;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//
//import java.util.List;
//
//
//public class HibernateUserDaoImpl implements UserDao {
//
//    @Override
//    public void AddUserToDB(String user_name, String user_lastname, String user_unicname) {
//       SessionFactory  sessionFactory = HibernaiteConnect.getSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//
//        User user = new User();
//        user.setName(user_name);
//        user.setLastName(user_lastname);
//        user.setUserName(user_unicname);
//
//        session.save(user);
//        session.getTransaction().commit();
//        session.close();
//    }
//
//    @Override
//    public List<User> showAllusersFromDB() {
//        return null;
//    }
//
//    @Override
//    public long getUserid(String s) {
//        return 0;
//    }
//}
