package com.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.model.Student;
import com.service.StudentService;

@ManagedBean(name = "studentBean")
@SessionScoped
public class StudentBean implements Serializable {
	private static final long	serialVersionUID	= 3131315364731180503L;

	@ManagedProperty(value = "#{studentService}")
	private StudentService		service;

	private String				studentName;
	private String				studentAge;
	private String				studentCourse;

	public void setService(StudentService service) {
		this.service = service;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public void saveStudent() {
		System.out.println("saveStudent()");
		service.saveStudent(new Student(studentName, Integer.parseInt(studentAge), studentCourse));
	}

	public void saveStudents() {
		System.out.println("saveStudents()");
		service.saveStudents();
	}

	public void updateStudents() {
		System.out.println("updateStudents()");
		service.updateStudents();
	}

	public void showAllStudents() {
		System.out.println("showAllStudents()");
		service.showAllStudents();
	}

	public void deleteAllStudents() {
		System.out.println("deleteAllStudents()");
		service.deleteAllStudents();
	}

}
