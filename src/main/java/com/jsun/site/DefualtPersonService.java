package com.jsun.site;

import com.jsun.site.entities.Person;
import com.jsun.site.repositories.PersonRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

@Service
public class DefualtPersonService implements PersonService 
{
	@Inject PersonRepository repository;

	@Override
	@Transactional
	public void savePerson(Person person) {
		this.repository.save(person);
	}

	@Override
	@Transactional
	public Page<Person> searchPeople(SearchCriteria searchCriteria, Pageable pageable) {
		return this.repository.search(searchCriteria, pageable);
	}
}
