package question2;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
		student.add(new Student(1,"mahesh",190));
		student.add(new Student(2,"hiralal",130));
		student.add(new Student(3,"ramu",490));
		
		student.add(new Student(4,"santosh",500));
		student.add(new Student(5,"mishara",390));
		student.add(new Student(6,"sanketmisra",120));
		
		Student maxs=student.stream()
				.max((s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1).get();
		        
		System.out.println(maxs);
	}

}
