package com.bridgeproject.javacourses;

import java.math.BigDecimal;

public class CourseInfo {

	private Long id;
	private String name;
	private String Description;
	private BigDecimal price;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return Description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public CourseInfo(Long id, String name, String description, BigDecimal price) {
		this.id = id;
		this.name = name;
		this.Description = description;
		this.price = price;
	}
	public Long put(Long id, CourseInfo courses) {
		// TODO Auto-generated method stub
		return id;
	}
	
	
}
