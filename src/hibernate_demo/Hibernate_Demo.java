/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_demo;

import org.edu.hibernate.dto.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.edu.hibernate.dto.Address;
import org.edu.hibernate.dto.StudentAcademic;

/**
 *
 * @author DELL
 */
public class Hibernate_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // get session factory object and open a session
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        
        //create new student object
        Student x = new Student();
        StudentAcademic x_academic = new StudentAcademic();
        x.setFirstName("Avadhoot");
        x.setLastName("Athalye");
        
        x_academic.setRollNo("S160001");
        x_academic.setStudent(x);
        
        x.setAcademic(x_academic);
        
        Address permanent = new Address();
        permanent.setAddressLine1("Neelkanth Building, A / 201");
        permanent.setAddressLine2("Ghodbandar Road, Near Railway Colony");
        permanent.setCity("Thane");
        permanent.setPincode("400612");
        permanent.setState("Maharashtra");
        permanent.setCountry("India");
                
        Address correspondence = new Address();
        correspondence.setAddressLine1("Neela Apartment, B / 23");
        correspondence.setAddressLine2("Dabolkar Road, Near ganesh tower");
        correspondence.setCity("Malad");
        correspondence.setPincode("410612");
        correspondence.setState("Maharashtra");
        correspondence.setCountry("India");

        
        x.setCorrespondence(correspondence);
        x.setPermanent(permanent);
        
        session.persist(x);
        
        tx.commit();
        session.close();
        
        
    }
    
}
