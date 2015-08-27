package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	@Override
	public void saveStudent(Student student) {
		HibernateTemplate hibernateTemplate = getHibernateTemplate();
		hibernateTemplate.save(student);
	}

	@Override
	public void saveStudents() {
		HibernateTemplate hibernateTemplate = getHibernateTemplate();
		Student student = null;
		for(int i = 1; i <= 10; i++) {
			student = new Student("student" + i, i + 20, "course" + i);
			hibernateTemplate.save(student);
		}
		System.out.println("All student saved. Please check data base..");
	}

	@SuppressWarnings("unchecked")
	@Override
	public void updateStudents() {
		HibernateTemplate hibernateTemplate = getHibernateTemplate();
		List<Student> list = hibernateTemplate.loadAll(Student.class);
		for(Student student : list) {
			student.setName(student.getName() + " updated");
			hibernateTemplate.update(student);
		}
		System.out.println("All student updated. Please check data base..");
	}

	@SuppressWarnings("unchecked")
	@Override
	public void showAllStudents() {
		List<Student> list = getHibernateTemplate().loadAll(Student.class);
		System.out.println(list);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void deleteAllStudents() {
		HibernateTemplate hibernateTemplate = getHibernateTemplate();
		List<Student> list = hibernateTemplate.loadAll(Student.class);
		for(Student student : list) {
			hibernateTemplate.delete(student);
		}
		System.out.println("All students deleted. Please check data base..");
	}
}