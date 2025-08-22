package ch07;

class Person1{
	private String name;
	private int age;
	private String gender;
	
	public Person1() {
		System.out.println("Persons의 default 생성자");
	}

	public Person1(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public void display() {
		System.out.println(name+" "+age+" "+gender);
	}
	
}

class Student1 extends Person1{
	private int sno;
	private String major;
	
	public Student1() {
		System.out.println("Student의 default 생성자");
	}
	public Student1(int sno, String major, String name, int age, String gender) {
		super(name, age, gender);
		this.sno = sno;
		this.major = major;
	}
	public void studentDisplay() {
		System.out.print(sno+" "+major+" ");
		display();
	}
}

public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person1 p = new Person1("kim",20,"여자");
		p.display();
		
		Student1 s1 = new Student1();
		s1.studentDisplay();
		
		Student1 s2 = new Student1(1,"컴공","Hong",20,"남자");
		s2.studentDisplay();
	}

}
