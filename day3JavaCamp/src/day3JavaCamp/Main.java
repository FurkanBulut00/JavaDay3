package day3JavaCamp;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", "abc123", 100);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
		instructorManager.rate(instructor);
		System.out.println("--------------------------------------");

		Student student = new Student(2, "Furkan ", "Bulut", "furkannbulut00@gmail.com", "123abc", "Türkiye");
		Student student2 = new Student(2, "Ali ", "Bulut", "furkannbulut00@gmail.com", "123abc", "Türkiye");

		StudentManager studentManager = new StudentManager();

		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
		studentManager.adress(student);
		System.out.println("--------------------------------------");
		studentManager.add(student2);
		studentManager.update(student2);
		studentManager.delete(student2);
		studentManager.adress(student2);

	}

}
