package com.example.BookStore.domain;
	

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class Book {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
	    private String title;
	    private String author;
	    private int publicationYear;
	    private String isbn;
	    private int price;
	    
	    

	    public Book(){}

	    public Book(String title, String author, int publicationYear, String isbn, int price){
	       this.title = title;
	       this.author = author; 
	       this.publicationYear = publicationYear;
	       this.isbn = isbn;
	       this.price = price;
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public int getPublicationYear() {
			return publicationYear;
		}

		public void setPublicationYear(int publicationYear) {
			this.publicationYear = publicationYear;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
	
}