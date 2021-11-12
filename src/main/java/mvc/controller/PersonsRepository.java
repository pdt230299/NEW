package mvc.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import mvc.model.Persons;

public interface PersonsRepository extends CrudRepository<Persons, String> {
	
	@Transactional
	@Query(value="SELECT * FROM perons", nativeQuery=true)
	List<Persons> getByTitle(String title);
}
