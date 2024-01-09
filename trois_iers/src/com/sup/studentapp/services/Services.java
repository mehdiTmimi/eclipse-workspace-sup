package com.sup.studentapp.services;

import java.util.List;

import com.sup.studentapp.models.Student;

public interface Services{
    // Students
	public boolean ajouterStudent(Student student);
    public Student getStudent(String cin);
    public List<Student> getStudents();
    public boolean removeStudent(String cin);
    public Student updateStudent(Student student);
    public float calculerMoyenne(String cin);
    // matieres
    

}