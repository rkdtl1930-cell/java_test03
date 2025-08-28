package ch10;

import java.util.Vector;

public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Student> v = new Vector<>();
		Student s1 = new Student(1, "홍길동", "컴공");
		v.add(s1);
		v.add(new Student(2, "김길동", "It"));
		v.add(new Student(3, "이길동", "영문학"));
		v.add(new Student(4, "박길동", "인공지능"));
		
		for(int i = 0 ; i < v.size(); i++) {
			Student s = v.get(i);
			System.out.println(s);
		}
	}

}
