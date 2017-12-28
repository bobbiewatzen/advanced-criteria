package com.jsun.site.repositories;

import com.jsun.site.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>, 
	SearchableRepository<Person> {

}
