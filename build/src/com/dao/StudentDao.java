package com.dao;

import com.model.Student;

public interface StudentDao {

	public abstract void saveStudent(Student student);

	public abstract void saveStudents();

	public abstract void updateStudents();

	public abstract void showAllStudents();

	public abstract void deleteAllStudents();
}
