package com.fullstack.springboot.maven.crud.springbootfullstackcrudwithmaven.courses;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class CoursesHardcodedService {

	private static List<Course> courses = new ArrayList<>();
	private static long idCounter = 0;

	static {

		courses.add(new Course(++idCounter, "thaiseer", "spring"));
		courses.add(new Course(++idCounter, "sabir", "react"));
		courses.add(new Course(++idCounter, "fayiz", "angular"));

	}

	public List<Course> getAll() {
		return courses;
	}

}
