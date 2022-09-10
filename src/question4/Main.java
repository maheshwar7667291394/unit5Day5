package question4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import question2.Student;


public class Main {
	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
		
		student.add(new Student(1,"mahesh",190));
		student.add(new Student(2,"hiralal",130));
		student.add(new Student(3,"ramu",690));
		
		student.add(new Student(4,"santosh",500));
		student.add(new Student(5,"mishara",890));
		student.add(new Student(6,"sanketmisra",520));
		
	 Collection<Student>  stu=student.stream()
			  .filter(s->s.getMarks()>500)
			  .collect(Collectors.toList());
	 
	 List<Student> stud=new ArrayList<>(stu);
	 for(Student item:stud) {
		 System.out.println(item);
	 }
		
	}

}
