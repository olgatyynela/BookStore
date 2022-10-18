package web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class BookController {

	
	@GetMapping("/index")
	  public String getBook(Model model) {
		return "hello";
	  }
}
