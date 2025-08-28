package ch10;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("홍길동");
		al.add("김길동");
		al.add("이길동");
		al.add("박길동");
		al.add("신길동");
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
	}

}
