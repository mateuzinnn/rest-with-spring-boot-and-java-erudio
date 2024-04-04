package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.erudio.models.Person;

@Service
public class PersonService {

	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonService.class.getName());
	
	public List<Person> findAll() {
		logger.info("finding all people...");
		List<Person> persons = new ArrayList<>();
		
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		
		return persons;
	}

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
	
	private Person mockPerson(int i) {
		Person person = new Person();
		
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name: " + i);
		person.setLastName("Last name: " + i);
		person.setAddress("Some address in Brasil: " + i);
		person.setGender("Male");
		
		return person;
	}

}
