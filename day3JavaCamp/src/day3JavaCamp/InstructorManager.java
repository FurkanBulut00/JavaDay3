package day3JavaCamp;

public class InstructorManager extends UserManager {

	public void add(User instructor) {
		System.out.println("E�itmen eklendi : " + instructor.getName() + instructor.getSurName());
	}

	public void delete(User instructor) {
		System.out.println("E�itmen silindi : " + instructor.getName() + instructor.getSurName());

	}

	public void update(User instructor) {
		System.out.println("E�itmen g�ncellendi : " + instructor.getName() + instructor.getSurName());

	}

	public void rate(Instructor instructor) {
		System.out.println("E�itmen puan� : " + instructor.getRating());
	}

}
