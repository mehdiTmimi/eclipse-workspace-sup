package com.sup.studentapp.dao;
import com.sup.studentapp.models.Student;
import java.util.List;
public interface StudentDao{
    public boolean save(Student student);
    public Student get(String cin);
    public List<Student> getAll();
    public boolean remove(String cin);
    public Student update(Student student);
}