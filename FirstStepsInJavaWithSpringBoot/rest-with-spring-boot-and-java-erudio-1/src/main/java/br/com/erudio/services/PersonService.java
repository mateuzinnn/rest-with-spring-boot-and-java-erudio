package br.com.erudio.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.models.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public Person findById(String id) {
		
		logger.info("finding one person...");
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Mateuzin");
		person.setLastName("Bola Certa");
		person.setAddress("São Bento do Una, Pernambuco, Brasil");
		person.setGender("Male");
		
		return person;
	}
}
