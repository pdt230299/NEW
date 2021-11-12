package mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.Persons;
@Controller
@RequestMapping(path = "/")

public class PersonsController {

	@Autowired
	private PersonsService service;
	
	@GetMapping("/")
	public String home(Model model) {
		List<Persons> listBook = service.getAllBook();
	    model.addAttribute("listBook", listBook);
		return "home_book";
	}
	
//	// mở trang edit
//	@GetMapping("/books/edit/{id}")
//	public String openEditPage(@PathVariable(name = "id") String id, Model model) {
//		Book book = service.getById(id);
//		model.addAttribute("book", book);
//		return "info_book";
//	}
//	
//	// edit
//	
//	@PostMapping(path = "/books/save_edit")
//	public String saveBook(@ModelAttribute("book") Book book) {
//	    service.updateBook(book);
//	    return "redirect:/";
//	}
//	
//	// cancel
//	@GetMapping(path = "/books/cancel_edit")
//	public String cancelEdit(Model model) {
//		List<Book> listBook = service.getAllBook();
//	    model.addAttribute("listBook", listBook);
//		return "home_book";
//	}
//	
//	// tìm kiếm
//	@GetMapping(path = "/books/search")
//	public String searchStaff(@ModelAttribute("inputSearch") String title, Model model) {
//		List<Book> listBook = service.getByTitle(title);
//	    model.addAttribute("listBook", listBook);
//		return "home_book";
//	}
}
