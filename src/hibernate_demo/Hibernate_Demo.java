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
import org.edu.hibernate.dto.Books;
import org.edu.hibernate.dto.Course;
import org.edu.hibernate.dto.Lecturer;
import org.edu.hibernate.dto.Regular;
import org.edu.hibernate.dto.Visiting;

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
        
        //Couple of books instance
        Books b = new Books();
        b.setTitle("Biochemistry 101");
        //setting the student object
        b.setStudent(x);
        
        Books c = new Books();
        c.setTitle("Mathematics: Intermidiate");
        c.setStudent(x);
        
        //for bidirectional assign the books to student
        x.getBooks().add(b);
        x.getBooks().add(c);
        
        //create instance of course
        Course java = new Course();
        java.setTitle("Core java programming");
        
        
        x.getCourses().add(java);
        
        
        Course cpp = new Course();
        cpp.setTitle("C++ Programming");
        
        
        x.getCourses().add(cpp);
        
        
        //student is persisted here
        session.persist(java);
        session.persist(cpp);
        session.persist(x);
        
        //Working with inheritance
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Anonymous");
        
        Regular Avadhoot = new Regular();
        Avadhoot.setName("Avadhoot Athalye");
        Avadhoot.setSalary(40000);
        
        Visiting Jay = new Visiting();
        Jay.setName("Jay Teachar");
        Jay.setHourlyCharges(1000);
        
        session.persist(lecturer);
        session.persist(Avadhoot);
        session.persist(Jay);
        
        tx.commit();
        session.close();
        
    }
    
}
