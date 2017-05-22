package com.po;

import java.io.Serializable;
import java.util.Set;

public class ClassPO implements Serializable{
	private long id;
	private String name;
	private Set<StudentPO> student;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<StudentPO> getStudent() {
		return student;
	}
	public void setStudent(Set<StudentPO> student) {
		this.student = student;
	}
	

}
