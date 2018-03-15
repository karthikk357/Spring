package com.maven.Spring_hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringHibernateTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("C:/Users/karth/workspace/Spring/Spring-hibernate/src/main/java");
		EmployeeDao dao = (EmployeeDao) context.getBean("emp");
	Employee e = new Employee();
	e.setId(11);
	e.setName("karu");
	e.setSalary(5566.23);
	dao.saveEmployee(e);
	
	
	
	}

}
