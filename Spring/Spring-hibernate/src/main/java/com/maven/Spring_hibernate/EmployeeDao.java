package com.maven.Spring_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class EmployeeDao {
	private HibernateTemplate template;
	public void setTemplate(HibernateTemplate template){
		this.template=template;
	}
	public void saveEmployee(Employee emp){
		SessionFactory sf= template.getSessionFactory();
		Session s= sf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(emp);
		tx.commit();
	}
/*public void updateEmployee(int id, String name){
	SessionFactory sf= template.getSessionFactory();
	Session s =sf.openSession();
	Transaction tx =s.beginTransaction();
	Employee e = (Employee) s.get(Employee.class, id);
	e.setName(name);
	s.update(e);
	tx.commit();
}*/
}
