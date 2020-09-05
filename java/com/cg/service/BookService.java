package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.Dao;
import com.cg.model.Book;

@Service
public class BookService {

	@Autowired Dao dao;
	
	public void add(Book book){
		dao.insertBook(book);
	}

	public void deleteBook(String bookId) {
		dao.deleteBook(bookId);
	}
	
	public void updateBook(String bookId,String bookName,String author,String publisher)
	{
		dao.updateBook(bookId, bookName, author, publisher);
	}
	
	public Book findBook(String bookId)
	{
	Book book=	dao.findBook(bookId);
	return book;
	}
	
}
