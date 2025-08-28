package ch10;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add((int)(Math.random()*50+1));
		al.add((int)(Math.random()*50+1));
		al.add((int)(Math.random()*50+1));
		al.add((int)(Math.random()*50+1));
		al.add((int)(Math.random()*50+1));
		int sum = 0;
		for(int i = 0 ; i < al.size(); i++) {
			System.out.print(al.get(i)+" ");
			sum += al.get(i);
		}
		System.out.println();
		System.out.println("합은 : "+sum);
	}

}
