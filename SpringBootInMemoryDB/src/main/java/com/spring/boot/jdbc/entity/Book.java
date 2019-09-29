package com.spring.boot.jdbc.entity;

import java.math.BigDecimal;

public class Book {

	private Long bookid;
	private String name;
	private BigDecimal price;
	
	
	public Book(Long bookid, String name, BigDecimal price) {
		this.bookid = bookid;
		this.name = name;
		this.price = price;
	}
	public Book(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	public Long getBookid() {
		return bookid;
	}
	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	
}
