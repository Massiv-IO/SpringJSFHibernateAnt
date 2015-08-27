package com.service;

import com.dao.StudentDao;
import com.model.Student;

public interface StudentService {

	public abstract StudentDao getStudentDao();

	public abstract void setStudentDao(StudentDao studentDao);

	public abstract void saveStudent(Student student);

	public abstract void saveStudents();

	public abstract void updateStudents();

	public abstract void showAllStudents();

	public abstract void deleteAllStudents();
}
