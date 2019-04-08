package com.fullstack.springboot.maven.crud.springbootfullstackcrudwithmaven.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseResource {

	@Autowired
	private CoursesHardcodedService service;

	 @GetMapping("/instructors/courses")
	public List<Course> getAllCourses() {

		return service.getAll();
	}

}
