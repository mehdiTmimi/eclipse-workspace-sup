import java.lang.reflect.Type;
import java.util.List;
import java.util.Vector;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sup.studentapp.dao.StudentDao;
import com.sup.studentapp.dao.StudentDaoFlatFile;
import com.sup.studentapp.dao.StudentDaoMemory;
import com.sup.studentapp.models.Student;
import com.sup.studentapp.services.DefaultServices;

public class Main{

	public Main() {
		DefaultServices s = 
				new DefaultServices(new StudentDaoFlatFile());
		List<Student> students = s.getStudents();
		
		/*
		 * 
		 * {
		 *	"cin" : "cd234234",
		 *	"nom" : "mehdi",
		 *	"age":31
		 * }
		 * 
		 * */
		/*Gson gson = new Gson();
		StudentDao studentDao= new StudentDaoMemory();
		List<Student> students=  studentDao.getAll();
		for(Student s:students)
				System.out.println(s.getCin());
		String ch = gson.toJson(students);
		System.out.println(ch);
		//TypeToken<List<Student>> type;
		Type type = new TypeToken<Vector<Student>>() {}.getType();
		List<Student> list = (List<Student>) gson.fromJson(ch, type);
		for(Student s:list)
			System.out.println(s.getCin());
		*/
		/*Student student = gson.fromJson("{\n"
				+ "		 \"cin\" : \"cd234234\",\n"
				+ "		 \"nom\" : \"mehdi\",\n"
				+ "		 \"age\":31\n"
				+ "		  }", Student.class);
		System.out.println(student.getCin()+ " " + student.getNom());
		student.setAge(100);
		String ch = gson.toJson(student);
		System.out.println(ch);*/
		
	}
	public static void main(String[] args) {
		new Main();
	}

}
