package day3JavaCamp;

public class InstructorManager extends UserManager {

	public void add(User instructor) {
		System.out.println("Eðitmen eklendi : " + instructor.getName() + instructor.getSurName());
	}

	public void delete(User instructor) {
		System.out.println("Eðitmen silindi : " + instructor.getName() + instructor.getSurName());

	}

	public void update(User instructor) {
		System.out.println("Eðitmen güncellendi : " + instructor.getName() + instructor.getSurName());

	}

	public void rate(Instructor instructor) {
		System.out.println("Eðitmen puaný : " + instructor.getRating());
	}

}
