package com.action;

import com.dao.StudentClassService;
import com.vo.ClassVO;
import com.vo.StudentVO;

public class StudentAction {
	private StudentVO studentvo1;
	private StudentVO studentvo2;
	private ClassVO classvo;
	private StudentClassService mtService;
	public StudentVO getStudentvo1() {
		return studentvo1;
	}
	public void setStudentvo1(StudentVO studentvo1) {
		this.studentvo1 = studentvo1;
	}
	public StudentVO getStudentvo2() {
		return studentvo2;
	}
	public void setStudentvo2(StudentVO studentvo2) {
		this.studentvo2 = studentvo2;
	}
	public ClassVO getClassvo() {
		return classvo;
	}
	public void setClassvo(ClassVO classvo) {
		this.classvo = classvo;
	}

	public StudentClassService getMtService() {
		return mtService;
	}
	public void setMtService(StudentClassService mtService) {
		this.mtService = mtService;
	}
	public String execute()throws Exception{
		boolean ok;
		try{
			ok=mtService.saveClassAndStudent(classvo, studentvo1, studentvo2);
		}
		catch(Exception e){
			e.printStackTrace();
			return "input";
		}
		if(ok){
			return "success";
		}
		else{
			return "input";
		}
	}

}
