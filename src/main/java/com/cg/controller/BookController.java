package com.cg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.model.Book;
import com.cg.model.Library;
import com.cg.service.BookService;


@Controller
public class BookController {

	@Autowired BookService service;
	
	@RequestMapping(value="add")
	public String insertBook(@ModelAttribute("book") Book book, @ModelAttribute("library") Library library)
	{
		book.setLibrary(library);
		service.add(book);
		return "index.jsp";
	}
	
	@RequestMapping("/delete")
	public String deleteBook(@RequestParam String bookId) {
	    service.deleteBook(bookId); 
	    return "index.jsp";
	    
	}
	
	@RequestMapping("/update")
	public String updateBook(@RequestParam String bookId, @RequestParam String bookName,
			@RequestParam String author, @RequestParam String publisher)
	{
		service.updateBook(bookId,bookName,author,publisher);
		return "index.jsp";
	}
	
	@RequestMapping("/find")
	public String findBook(@RequestParam String bookId,HttpSession session)
	{
	Book book =	service.findBook(bookId);
	session.setAttribute("author", book.getAuthor());
	session.setAttribute("bookId",book.getBookId());
	session.setAttribute("bookName", book.getBookName());
	session.setAttribute("publisher",book.getPublisher());
	session.setAttribute("libraryId",book.getLibrary().getLibraryId());
	session.setAttribute("libraryName",book.getLibrary().getLibraryName());
	return "find.jsp";
	}

}

