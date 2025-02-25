package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Books;
import com.example.demo.service.BooksService;

@RestController

public class BooksController {
	@Autowired
	BooksService booksService;
	
	@GetMapping("/book")
	private List<Books> getAllBooks(){
		return booksService.getAllBooks();
	}
	
	@GetMapping("/book/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookid)   
	{  
	return booksService.getBooks(bookid);  
	}  
	
	@PostMapping("/books")
	private Books saveBook(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books;
	}
	@PutMapping("/books")
	private Books update(@RequestBody Books books) {
		booksService.saveOrUpdate(books);
		return books;
	}
	@DeleteMapping("/deleteBook/{bookid}")
	private void deleteBook(@PathVariable("bookid") int bookid)
	{
		
		booksService.delete(bookid); 
	}

}
