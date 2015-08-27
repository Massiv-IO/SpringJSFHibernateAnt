package com.service;

import com.dao.StudentDao;
import com.model.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao	studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	@Override
	public void saveStudent(Student student) {
		studentDao.saveStudent(student);
	}

	@Override
	public void saveStudents() {
		studentDao.saveStudents();
	}

	@Override
	public void updateStudents() {
		studentDao.updateStudents();
	}

	@Override
	public void showAllStudents() {
		studentDao.showAllStudents();
	}

	@Override
	public void deleteAllStudents() {
		studentDao.deleteAllStudents();
	}
}