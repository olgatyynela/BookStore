package com.example.BookStore;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.BookStore.domain.Book;
import com.example.BookStore.domain.BookRepository;


@SpringBootApplication
public class BookStoreApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {return (args) -> {
		Book h = new Book("Liekehtivä Pikari", "J.K Rowling", 2000, "78964", 20);
		Book t = new Book("Houkutus", "Stephanie Meyer", 2005, "0987", 15);
		Book l = new Book("Sormuksen ritarit", "J.R.R Tolkien", 1954, "45678", 20);
		
		repository.save(h);
		repository.save(t);
		repository.save(l);
		
	};
	}

}
