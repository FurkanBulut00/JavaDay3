package day3JavaCamp;

public class StudentManager extends UserManager {
	public void add(User student) {
		System.out.println("��renci eklendi : " + student.getName() + student.getSurName());
	}

	public void delete(User student) {
		System.out.println("��renci silindi : " + student.getName() + student.getSurName());

	}

	public void update(User student) {
		System.out.println("��renci g�ncellendi : " + student.getName() + student.getSurName());

	}

	public void adress(Student student) {
		System.out.println("��renci Adresi : " + student.getAddress());
	}

}
