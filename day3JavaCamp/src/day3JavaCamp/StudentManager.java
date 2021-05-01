package day3JavaCamp;

public class StudentManager extends UserManager {
	public void add(User student) {
		System.out.println("Öğrenci eklendi : " + student.getName() + student.getSurName());
	}

	public void delete(User student) {
		System.out.println("Öğrenci silindi : " + student.getName() + student.getSurName());

	}

	public void update(User student) {
		System.out.println("Öğrenci güncellendi : " + student.getName() + student.getSurName());

	}

	public void adress(Student student) {
		System.out.println("Öğrenci Adresi : " + student.getAddress());
	}

}
