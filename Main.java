package Hibernate;

import java.util.ArrayList;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class Main 
{
	public static void main(String[] args)
	{
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory = c.buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setSalary(98000);
		e1.setEmpname("Vedant Surywanshi");
		
		Employee e2 = new Employee();
		e2.setSalary(78000);
		e2.setEmpname("Revanshi Surywanshi");
		
		Employee e3 = new Employee();
		e3.setSalary(98700);
		e3.setEmpname("Arnav Patil");
		
		Employee e4 = new Employee();
		e4.setSalary(45000);
		e4.setEmpname("Chunni Patil");
		
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		list1.add(e1);
		list1.add(e3);
		list1.add(e4);
		
		ArrayList<Employee> list2 = new ArrayList<Employee>();
		list2.add(e4);
		
		Department d1 = new Department();
		d1.setDeptname("IT");
		d1.setEmp(list1);
		
		Department d2 = new Department();
		d2.setDeptname("Marketing");
		d2.setEmp(list2);
		
		session.persist(d1);
		session.persist(d2);
		t.commit();
		session.close();
		System.out.println("Sucess..!");
	}
}
