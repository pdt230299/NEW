package mvc.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.model.Persons;

@Service
@Transactional
public class PersonsService {

	@Autowired
	private PersonsRepository bookRespo;
	
	List<Persons> getAllBook(){
		return (List<Persons>) bookRespo.findAll();
	}
	
	List<Persons> getByTitle(String title){
		return bookRespo.getByTitle(title);
	}
	
	Persons getById(String id){
		return bookRespo.findById(id).get();
	}
	
	Persons updateBook(Persons book) {
		return bookRespo.save(book);
	}
}
