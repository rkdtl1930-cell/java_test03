package ch10;

public class Student {
	private int sno;
	private String name;
	private String major;
	
	public Student() {};
	public Student(int sno, String name, String major) {
		this.sno = sno;
		this.name = name;
		this.major = major;
	}
	public String toString() {
		return sno+" "+name+" "+ major;
	}
}
