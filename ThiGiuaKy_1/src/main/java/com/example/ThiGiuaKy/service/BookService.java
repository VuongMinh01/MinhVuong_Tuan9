package com.example.ThiGiuaKy.service;

import java.util.List;

import com.example.ThiGiuaKy.entity.Book;

public interface BookService {
	public Book saveBook(Book book);
	public List<Book> getBooks();
}
