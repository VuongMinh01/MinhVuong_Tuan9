package com.example.ThiGiuaKy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ThiGiuaKy.entity.Book;
import com.example.ThiGiuaKy.repository.BookRepository;
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	
	
	
}
