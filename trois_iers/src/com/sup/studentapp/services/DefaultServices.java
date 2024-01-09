package com.sup.studentapp.services;

import java.util.List;

import com.sup.studentapp.dao.StudentDao;
import com.sup.studentapp.dao.StudentDaoMemory;
import com.sup.studentapp.models.Student;

public class DefaultServices implements Services{

	// I i  = tout objet d'une classe
	// qui implemte I
	// Bridge => design pattern
	private StudentDao studentDao;
	public DefaultServices(StudentDao studentDao) {
		this.studentDao= studentDao;
	}
	@Override
	public boolean ajouterStudent(Student student)
	{
		boolean res = studentDao.save(student);
		return res;
	}

	@Override
	public Student getStudent(String cin) {
		Student student = studentDao.get(cin);
		return student;
	}

	@Override
	public List<Student> getStudents() {
		return null;
	}

	@Override
	public boolean removeStudent(String cin) {
		return false;
	}

	@Override
	public Student updateStudent(Student student) {
		return null;
	}

	@Override
	public float calculerMoyenne(String cin) {
		// List<Note> notes = noteDaoMemory.getAll()
		// bouble pour chercher toutes les notes
		return 0;
	}

}
