package com.bridgeit.setters;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource resource = new ClassPathResource("/com/bridgeit/setters/primitive.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	
	Person2 p = (Person2)factory.getBean("emp1");
	p.display();
}
}
