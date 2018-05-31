package com.bridgeit.CollectionInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
public static void main(String[] args) {
	Resource resource=new ClassPathResource("/com/bridgeit/CollectionInjection/Listinjection.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
	Person per = (Person)factory.getBean("list");
	per.display();
	
}
}
