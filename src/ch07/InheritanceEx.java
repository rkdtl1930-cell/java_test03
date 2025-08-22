package ch07;

class Person{
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public Person() {}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99; // 슈퍼 클래스의 weight 가 private여서 접근 불가
		setWeight(99);
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.set();
	}

}
