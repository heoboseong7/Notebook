package last2;

import last.Person;

public class TestProtected1 {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		System.out.println(s.getAge());
		System.out.println(s.name);
		System.out.println(s.getHeight());
		System.out.println(s.getWeight());
		Student[] t = {new Student(), new Student()};
		t[0].set();
		t[1].set();
		System.out.println(t[0].getHeight());
		System.out.println(t[1].getWeight());
	}
}

class Student extends Person {
	public void set() {
		setAge(30);
		name = "Gildong Hong";
		height = 175;
		setWeight(99);
	}
}
