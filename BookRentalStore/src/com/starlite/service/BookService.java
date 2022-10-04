package com.starlite.service;

import com.starlite.dao.BookDAO;
import com.starlite.model.Book;

public class BookService {
	public static boolean addBook(Book book) {
		boolean result=false;
		BookDAO.addBook(book);
		return result;
	}
	public static Book[] displayBooks() {
		return BookDAO.displayBooks();
	}
}