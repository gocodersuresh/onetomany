package Hibernate.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Hibernate.mapping.model.School;
import Hibernate.mapping.model.Student;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sesfactory=new Configuration().configure().buildSessionFactory();
        
        Session sessionObj=sesfactory.openSession();
        Transaction tx=sessionObj.beginTransaction();
        
        School scObj=new School();
        scObj.setSchoolName("PVM");
        
        Student s1=new Student();
        s1.setSchoolName(scObj);
        Student s2=new Student();
        s1.setSchoolName(scObj);
        
        List<Student> studList=new ArrayList<Student>();
        studList.add(s1);
        studList.add(s2);
        
        scObj.setStudent(studList);
        try {
			sessionObj.save(scObj);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        sessionObj.close();
        tx.commit();
    }
}
