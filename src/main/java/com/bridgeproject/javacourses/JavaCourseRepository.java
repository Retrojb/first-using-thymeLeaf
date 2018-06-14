package com.bridgeproject.javacourses;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class JavaCourseRepository {

	private Map<Long, CourseInfo> courses = new HashMap<>();
	
	
	public Map<Long, CourseInfo> getCourses() {
		return courses;
	}
	
	public JavaCourseRepository() {
		CourseInfo courseOne = new CourseInfo(1101L, "Intro to Java", "Intro to java course", new BigDecimal("1000.00"));
		CourseInfo courseTwo = new CourseInfo(1103L, "Intro to Javascript", "Intro to javascript", new BigDecimal("1200.00"));
		CourseInfo courseThree = new CourseInfo(1104L, "Intro to Springframe", "Intro to springframe", new BigDecimal("1550.00"));
		
		this.addCourses(courseOne);
		this.addCourses(courseTwo);
		this.addCourses(courseThree);
	}

	public Collection<CourseInfo> findAll(){
		return courses.values();
	}
	
	
	public void addCourses(CourseInfo courses) {
		courses.put(courses.getId(), courses);
	}

	public Object findById(Long id) {
		return courses.get(id);
	}

	
}
