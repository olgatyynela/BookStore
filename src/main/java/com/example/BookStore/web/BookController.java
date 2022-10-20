package com.example.BookStore.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.BookStore.domain.Book;
import com.example.BookStore.domain.BookRepository;

import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@GetMapping("/booklist")
	  public String BookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist";
	  }
	@GetMapping("/addbookpage")
	public String addBookpage(Model model) {
		model.addAttribute("book", new Book());
	    return "addbook";
	}
	
	@PostMapping("/addbook")
	public String addBook(@ModelAttribute Book book, Model model) {
		repository.save(book);
		model.addAttribute("books", repository.findAll());
	    return "booklist";
	}
	
	@GetMapping("/deletebook/{id}")
	public String deleteBook(@PathVariable("id") String bookId, Model model) {
		long id = Integer.parseInt(bookId);
		repository.deleteById(id);
		model.addAttribute("books", repository.findAll());
		return "booklist";
	}
	
	@GetMapping("/editbookpage/{id}")
	public String editBookpage(@PathVariable("id") String bookId, Model model) {
		long id = Integer.parseInt(bookId);
		model.addAttribute("booktoedit", repository.findById(id));
		model.addAttribute("bookid", bookId);
		return "editbook";
	}
	
	@PostMapping("/editbook/{id}")
	public String editBook(@PathVariable("id") String bookId, @ModelAttribute Book editedBook, Model model) {
		long id = Integer.parseInt(bookId);
		editedBook.setId(id);
		repository.save(editedBook);
		model.addAttribute("books", repository.findAll());
	    return "booklist";
	}

 }
