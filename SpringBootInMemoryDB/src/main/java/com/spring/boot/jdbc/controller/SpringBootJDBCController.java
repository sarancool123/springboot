package com.spring.boot.jdbc.controller;

	import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.jdbc.entity.Book;
import com.spring.boot.jdbc.repository.IBookRepository;

@RestController
public class SpringBootJDBCController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private IBookRepository bookRepository;

	@RequestMapping("/viewbook")
	public List<Book> add() {
		return bookRepository.findAll();
	}
	
	@RequestMapping("/generateddl")
	public String generateDDL() {
		createDDL();
		return "Welcome to Spring Boot + JDBC";
		
	}
	
	private void createDDL() {

        System.out.println("Tables Creation...");

        jdbcTemplate.execute("DROP TABLE books IF EXISTS");
        jdbcTemplate.execute("CREATE TABLE books(" +
                "id SERIAL, name VARCHAR(255), price NUMERIC(15, 2));");

        List<Book> books = Arrays.asList(
                new Book("Design Patterns", new BigDecimal("350.00")),
                new Book("Java Complete Reference", new BigDecimal("400.00")),
                new Book("Angular Js", new BigDecimal("280.00")),
                new Book("React JS", new BigDecimal("550.00"))
        );

        books.forEach(book -> {
            System.out.println("bookname=>"+ book.getName());
            bookRepository.save(book);
        });

    }
	
}
