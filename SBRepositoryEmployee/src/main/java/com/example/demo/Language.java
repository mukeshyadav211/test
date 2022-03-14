package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {

	public Language() {
		
	}
	@Id
private int id;
private String name;
private String course;

public String getLname() {
	return name;
}
public void setLname(String lname) {
	this.name = lname;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
