package com.example.BookStore;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.BookStore.domain.Book;
import com.example.BookStore.domain.BookRepository;
import com.example.BookStore.domain.Category;
import com.example.BookStore.domain.CategoryRepository;
import com.example.BookStore.domain.User;
import com.example.BookStore.domain.UserRepository;


@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository brepository, CategoryRepository crepository, UserRepository urepository) {return (args) -> {
		Category c1 = new Category("Fantasia");
		Category c2 = new Category("Romantiikka");
		Category c3 = new Category("Rikos");
		Category c4 = new Category("Jännitys");
		Category c5 = new Category("Tieto");
		Category c6 = new Category("Nuorten kirjallisuus");
		Category c7 = new Category("Historia");
		
		crepository.save(c1);
		crepository.save(c2);
		crepository.save(c3);
		crepository.save(c4);
		crepository.save(c5);
		crepository.save(c6);
		crepository.save(c7);
		
		Book b1 = new Book("Liekehtivä Pikari", "J.K. Rowling", 2000, "78964", 20, c1);
		Book b2 = new Book("Houkutus", "Stephanie Meyer", 2005, "0987", 15, c6);
		Book b3 = new Book("Sormuksen ritarit", "J.R.R Tolkien", 1954, "45678", 20, c1);
	
		
		brepository.save(b1);
		brepository.save(b2);
		brepository.save(b3);
		
		User u1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER", "user@email.com");
		User u2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN", "admin@email.com");
		urepository.save(u1);
		urepository.save(u2);
		
	};
	}

}
