package com.spring.boot.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.jdbc.entity.Book;

@Service
public class BookRepositoryImpl implements IBookRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int count() {
		return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM BOOKS", Integer.class);
	}

	@Override
	public int save(Book book) {
		
		return jdbcTemplate.update("INSERT INTO books(name, price) VALUES (?,?)",book.getName(),book.getPrice());
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE books SET price=? WHERE ID=?",
				book.getPrice(),book.getBookid());
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("DELETE books WHERE ID=?",id);
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM books",
							(rs,b)-> new Book(rs.getLong("id"),rs.getString("name"),rs.getBigDecimal("price")));
	}

}
