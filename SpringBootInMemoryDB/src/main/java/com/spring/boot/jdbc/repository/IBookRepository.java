package com.spring.boot.jdbc.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.jdbc.entity.Book;

@Service
public interface IBookRepository {

	int count();
	
	int save(Book book);
	
	int update(Book book);
	
	int deleteById(Long id);
	
	List<Book> findAll();	
	
	
}
