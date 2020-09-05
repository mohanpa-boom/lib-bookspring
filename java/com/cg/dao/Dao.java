package com.cg.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.cg.model.Book;

@Component
public class Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsersDB");
	EntityManager em = emf.createEntityManager();
	EntityTransaction trans = em.getTransaction();
	
	public void insertBook(Book book)
	{
		trans.begin();
		em.persist(book);
		trans.commit();
	}
	
	public void deleteBook(String bookId) {
		Book book =  em.find(Book.class, bookId);
		trans.begin();
		em.remove(book);
		trans.commit();
	}
	
	public Book findBook(String bookId) {
		Book book =  em.find(Book.class, bookId);
		return book;
	}
	
	public Book updateBook(String bookId, String bookName, String author, String publisher) {
		Book book =  em.find(Book.class, bookId);
		trans.begin();
	    book.setAuthor(author);
		book.setBookName(bookName);
		book.setPublisher(publisher);
		em.persist(book);
		trans.commit();
		return book;
	}
	
	 public List<Book> showAllBooks() {
	        TypedQuery<Book> query = em.createQuery("SELECT book FROM Book book", Book.class);
			List<Book> books = query.getResultList();
			return books;
	    }
	

}
