package com.po;

import java.io.Serializable;

public class StudentPO implements Serializable{
	private long id;
	private String name;
	private String sex;
	private ClassPO classpo;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public ClassPO getClasspo() {
		return classpo;
	}
	public void setClasspo(ClassPO classpo) {
		this.classpo = classpo;
	}
	

}
