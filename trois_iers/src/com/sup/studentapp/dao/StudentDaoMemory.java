package com.sup.studentapp.dao;
import java.util.*;

import com.sup.studentapp.models.Student;
public class StudentDaoMemory implements StudentDao{

    private List<Student> students;
    public StudentDaoMemory(){
        students = new Vector();
        students.add(new Student("CD12432","ali",30));
        students.add(new Student("WE35443","sarah",20));
    }
    @Override
    public boolean save(Student student){
    	if(get(student.getCin())!=null)
    		return false;
    	students.add(student);
    	return true;
    }
    @Override
    public Student get(String cin){
    	for(Student student:students)
    		if(student.getCin().equals(cin))
    			return student;
    	return null;
    }
    @Override
    public List<Student> getAll(){
    	return students;
    }
    @Override
    public boolean remove(String cin){
    	Student student = get(cin);
    	if(student==null)
    		return false;
    	students.remove(student);
    	return true;
    }
    @Override
    public Student update(Student student){
    	Student oldStudent = get(student.getCin());
    	if(oldStudent==null)
    		return null;
    	oldStudent.setNom(student.getNom());
    	oldStudent.setAge(student.getAge());
    	return oldStudent;
    }
}