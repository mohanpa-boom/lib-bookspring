package com.cg.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book")

public class Book {

	@Id
	private String bookId;
	private String bookName;
	private String Author;
	private String publisher;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="libaryId")
	private Library library;
	
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(String bookId, String bookName, String author, String publisher) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		Author = author;
		this.publisher = publisher;
	}
	
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", Author=" + Author + ", publisher=" + publisher
				+ ", library=" + library + "]";
	}
	
	
}
