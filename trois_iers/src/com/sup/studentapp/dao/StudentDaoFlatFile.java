package com.sup.studentapp.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sup.studentapp.models.Student;

public class StudentDaoFlatFile implements StudentDao{

	private List<Student> students;
	private Gson gson;

	public StudentDaoFlatFile() {
		try {
		gson =new Gson();
		Type type = new TypeToken<Vector<Student>>() {}.getType();
		//PrintWriter pr = 
			//	new PrintWriter("students.json");
		//BufferedReader reader = new BufferedReader(new FileReader("students.json"));
		Scanner scanner = new Scanner(new FileReader("students.json"));
		String ch = scanner.nextLine();
		students = gson.fromJson(ch, type);
		for(Student s: students)
			System.out.println(s.getCin());
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	@Override
	public boolean save(Student student) {
		if(get(student.getCin())!=null)
    		return false;
    	students.add(student);
    	String ch = gson.toJson(students);
    	try {
    		// ecriture
    		FileWriter writer = new FileWriter("students.json");
    		writer.write(ch);
    		writer.close();
    	}catch(Exception e) {
    		students.remove(student);
    		return false;
    	}
    	return true;
	}

	@Override
	public Student get(String cin) {
		for(Student student:students)
    		if(student.getCin().equals(cin))
    			return student;
    	return null;
	}

	@Override
	public List<Student> getAll() {
		return students;
	}

	@Override
	public boolean remove(String cin) {
		Student student = get(cin);
    	if(student==null)
    		return false;
    	students.remove(student);
		String ch = gson.toJson(students);
		try {
    		FileWriter writer = new FileWriter("students.json");
    		writer.write(ch);
    		writer.close();
    	}catch(Exception e) {
			students.add(student);
    		return false;
    	}
		return true;
	}

	@Override
	public Student update(Student student) {
		Student oldStudent = get(student.getCin());
    	if(oldStudent==null)
    		return null;
    	oldStudent.setNom(student.getNom());
    	oldStudent.setAge(student.getAge());
		String ch = gson.toJson(students);
		try {
    		FileWriter writer = new FileWriter("students.json");
    		writer.write(ch);
    		writer.close();
    	}catch(Exception e) {
    		return false;
    	}
    	return oldStudent;
	}

}
