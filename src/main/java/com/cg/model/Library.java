package com.cg.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Library")
public class Library {

	@Id
	@JoinColumn(name="libraryId")
	private String libraryId;
	private String libraryName;
	
	@OneToMany(mappedBy = "library")
	private List<Book> books;

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(String libraryId, String libraryName) {
		super();
		this.libraryId = libraryId;
		this.libraryName = libraryName;
	}
	
	public List<Book> getBooks() {
		return books;
	}
		public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getLibraryId() {
		return libraryId;
	}
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", books=" + books + "]";
	}	
}
