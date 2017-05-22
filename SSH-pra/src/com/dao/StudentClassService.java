package com.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;

import com.po.ClassPO;
import com.po.StudentPO;
import com.vo.ClassVO;
import com.vo.StudentVO;

public class StudentClassService {
	private ClassDao classdao;
	private ClassPO classpo;
	private StudentPO studentpo1;
	private StudentPO studentpo2;
	private Set<StudentPO> students;
	
	

	public Set<StudentPO> getStudents() {
		return students;
	}


	public void setStudents(Set<StudentPO> students) {
		this.students = students;
	}


	public ClassDao getClassdao() {
		return classdao;
	}


	public void setClassdao(ClassDao classdao) {
		this.classdao = classdao;
	}


	public ClassPO getClasspo() {
		return classpo;
	}

	public void setClasspo(ClassPO classpo) {
		this.classpo = classpo;
	}


	public StudentPO getStudentpo1() {
		return studentpo1;
	}

	public void setStudentpo1(StudentPO studentpo1) {
		this.studentpo1 = studentpo1;
	}

	public StudentPO getStudentpo2() {
		return studentpo2;
	}

	public void setStudentpo2(StudentPO studentpo2) {
		this.studentpo2 = studentpo2;
	}



	public boolean saveClassAndStudent(ClassVO classvo,StudentVO studentvo1,StudentVO studentvo2){
		
		classpo.setName(classvo.getName());
		
		
		studentpo1.setName(studentvo1.getName());
		studentpo1.setSex(studentvo1.getSex());
		
		
		studentpo2.setName(studentvo2.getName());
		studentpo2.setSex(studentvo2.getSex());
		
		studentpo1.setClasspo(classpo);
		studentpo2.setClasspo(classpo);
		
		
		students.add(studentpo1);
		students.add(studentpo2);
		classpo.setStudent(students);
		
		try{
			if(classdao.saveClass(classpo)==true)
			return true;
			else
				return false;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

}
