package com.test.java.data;

public class Student {

	private String no;
	private String name;
	private String gradeNo;
	private String classNo;
	private String studentNO;
	
	public Student(String no, String name, String gradeNo, String classNo, String studentNO) {
		super();
		this.no = no;
		this.name = name;
		this.gradeNo = gradeNo;
		this.classNo = classNo;
		this.studentNO = studentNO;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGradeNo() {
		return gradeNo;
	}

	public void setGradeNo(String gradeNo) {
		this.gradeNo = gradeNo;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getStudentNO() {
		return studentNO;
	}

	public void setStudentNO(String studentNO) {
		this.studentNO = studentNO;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", gradeNo=" + gradeNo + ", classNo=" + classNo + ", studentNO="
				+ studentNO + "]";
	}
	
	
	
}
