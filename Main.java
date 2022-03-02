import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher lakshmi = new Teacher(1, "Lakshmi", 10000);

		Teacher jhansi = new Teacher(2, "Jhansi", 12000);

		Teacher prasad = new Teacher(3, "Prasad", 10000);

		List<Teacher> teacherList = new ArrayList<>();

		teacherList.add(lakshmi);
		teacherList.add(jhansi);
		teacherList.add(prasad);

		Student manikanta = new Student(1, "manikanta", 4);
		Student naidu = new Student(2, "naidu", 5);
		Student nagendra = new Student(3, "nagendra", 6);

		List<Student> studentList = new ArrayList<>();

		studentList.add(manikanta);
		studentList.add(naidu);
		studentList.add(nagendra);

		School abc = new School(teacherList, studentList);

		manikanta.updateFeesPaid(15000);
		System.out.println("manikanta paid fee - 15000 ");

		naidu.updateFeesPaid(16000);
		System.out.println("naidu paid fee - 16000 ");
		
		System.out.println("abc has earned " + abc.getTotalMoneyEarned());

		System.out.println("abc paid salaries");

		lakshmi.receiveSalary(lakshmi.getSalary());
		System.out.println("lakshmi got salary - 10000");
		
		System.out.println(
				"abc has spent for salary to" + lakshmi.getName() + " and now abc has " + abc.getTotalMoneyEarned());

		jhansi.receiveSalary(jhansi.getSalary());
		System.out.println("jhansi got salary - 12000");
		
		System.out.println(
				"abc has spent for salary to" + jhansi.getName() + "  and now abc has " + abc.getTotalMoneyEarned());

		System.out.println(manikanta);
		
		jhansi.receiveSalary(jhansi.getSalary());
		lakshmi.receiveSalary(jhansi.getSalary());
		
		System.out.println(jhansi);
		System.out.println(lakshmi);

	}

}