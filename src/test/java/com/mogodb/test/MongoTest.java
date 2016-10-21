package com.mogodb.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mongodb.core.entity.Address;
import com.mongodb.core.entity.Person;
import com.mongodb.core.service.NatureRepositoryImpl;
import com.mongodb.core.service.Repository;

public class MongoTest {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"classpath:/applicationContext.xml");

		Repository<Person> repository = context.getBean(NatureRepositoryImpl.class);
		repository.dropCollection();
		repository.createCollection();
		
		Person person = new Person();
		Address address = new Address();
		address.setAddr("ºÏ·Ê");
		address.setPro("°²»Õ");
		person.setAddress(address);
		person.setAge(20);
		person.setName("senssic");
		person.setId("1");
		repository.saveObject(person);
		
		System.out.println("1. " + repository.getAllObjects());
		person.setId("101");
		repository.saveObject(person);
		
		System.out.println("2. " + repository.getAllObjects());
		System.out.println("Tree with id 1" + repository.getObject("1"));
		repository.updateObject("1", "sen");
		
		System.out.println("3. " + repository.getAllObjects());
		repository.deleteObject("1");
		
		System.out.println("4. " + repository.getAllObjects());
		context.close();
	}
}