package gun3Odev1;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Kadriye", "Çakmak","cakmakkadriye45@gmail.com","1234569");
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.Login(user);
		userManager.Logout(user);
		Student student = new Student(1,"Kadriye","Çakmak");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", 12000);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);

	}

}
