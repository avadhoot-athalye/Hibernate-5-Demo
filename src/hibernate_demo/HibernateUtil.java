/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL
 */
public class HibernateUtil {
    
    private static final SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration().configure("/hibernate_demo/hibernate.cfg.xml").buildSessionFactory();
            
//    static {
//        try {
//            //read the configure file
//            Configuration configuration = new Configuration().configure("/hibernate_demo/hibernate.cfg.xml");
//            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
//                        .applySettings(configuration.getProperties())
//                        .build();
//            sessionFactory = configuration.buildSessionFactory(registry);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            throw new ExceptionInInitializerError("Session factory initialization failed!");
        }
    }
    
        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }
}
