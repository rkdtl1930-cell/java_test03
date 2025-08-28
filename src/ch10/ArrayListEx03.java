package ch10;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(1, "홍길동", "컴공");
		al.add(s1);
		al.add(new Student(2, "김길동", "It"));
		al.add(new Student(3, "이길동", "영문학"));
		al.add(new Student(4, "박길동", "인공지능"));
		al.add(new Student(5, "신길동", "전자공학"));
		
		for(int i = 0 ; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println(s);
		}
	}
}
