package ch10.aa;

import java.util.*;

public class StudentEx {
	static Scanner sc;
	static ArrayList<Student> aStudent;
	
	static void input() {
		int score[] = new int[3];
		System.out.print("이름, 학번, 전공, 성적 입력>>");
		String name = sc.next();
		int sno = sc.nextInt();
		String major = sc.next();
		for(int i=0 ; i<score.length; i++) {
			score[i] = sc.nextInt();
		}
//		int java = sc.nextInt();
//		int db = sc.nextInt();
//		int python = sc.nextInt();
		aStudent.add(new Student(name, sno, major, score));
	}
	
	static void search() {
		System.out.println("이름 입력>>");
		String name = sc.next();
		boolean flag = false;
		for(int i = 0; i < aStudent.size(); i++) {
			Student s = aStudent.get(i);
			if(s.getName().equals(name)) {
				s.display();
				flag = true;
			}
		}
		if(!flag) {
			System.out.println("데이터를 찾지 못했습니다.");
		}
		System.out.println("검색 종료");
	}
	
	static void allShow() {
		for(int i = 0 ; i < aStudent.size(); i++) {
			for(int j=0; j < aStudent.size(); j++) {
				aStudent.get(i).setRank(aStudent.get(j));
			}
		}
		for(int i=0 ; i < aStudent.size(); i++) {
			System.out.println(aStudent.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aStudent = new ArrayList<>();
		sc = new Scanner(System.in);
		boolean flag = false;
		while(true) {
			System.out.println("입력(1), 조회(2), 전체보기(3), 종료(4)");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				input();
				break;
			case 2:
				search();
				break;
			case 3:
				allShow();
				break;
			case 4:
				flag = true;
				break;
			default:
				System.out.println("입력 오류");
			}
			if(flag) {
				break;
			}
		}
		System.out.println("종료합니다.");
	}

}
