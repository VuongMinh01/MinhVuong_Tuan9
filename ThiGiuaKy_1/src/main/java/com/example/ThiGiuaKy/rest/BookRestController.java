package com.example.ThiGiuaKy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ThiGiuaKy.entity.Book;
import com.example.ThiGiuaKy.service.BookService;

@RestController
public class BookRestController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@GetMapping("/books")
	public List<Book> getSubjects() {
        return bookService.getBooks();
    }
	
}
