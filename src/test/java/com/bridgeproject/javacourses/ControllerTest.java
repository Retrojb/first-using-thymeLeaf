package com.bridgeproject.javacourses;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

//@RunWith(SpringRunner.class)
//@WebMvcTest(HomeController.class)
//
////first style of a controller existence test
//public class ControllerTest {
//	
//	@Resource
//	MockMvc mvc;
//	@MockBean
//	HomeController controller;
//	@Mock
//	JavaCourserepository repo;
//	@Mock
//	CourseInfo courseInfo;
//	
//	//this just says its hitting the products page
//	@Test
//	public void getCourseShouldReturnCoursesView() throws Exception {
//		mvc.perform(get("/course")).andExpect( view().name(is(equalTo("courses"))));
//	}
//	private Object view() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	private RequestBuilder get(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Test
//	public void getCourseShouldBeOk() throws Exception{
//		mvc.perform(get("/courses")).andExpect(status().is2xxSuccessful());
//	}
//}

