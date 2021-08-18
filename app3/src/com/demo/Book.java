package com.demo;

import java.util.Date;

public class Book {
	private int id;
	private String title;
	private double price;
	private Date date;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book(int id, String title, double price, Date date) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.date = date;
	}
	public Book() {}

}
