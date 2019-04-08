package com.fullstack.springboot.maven.crud.springbootfullstackcrudwithmaven.courses;

public class Course {

	private long id;
	private String userName;
	private String description;
	
	public Course(long id, String userName, String description) {
		
		this.id =  id;
		this.userName =userName;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", userName=" + userName + ", description=" + description + "]";
	}

}
