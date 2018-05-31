package com.bridgeit.SpringExamples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Employee2Test {
	
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("/com/bridgeit/SpringExamples/Employee.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		Employee2 emp=(Employee2)factory.getBean("employee");
		System.out.println(emp);
	}

}
