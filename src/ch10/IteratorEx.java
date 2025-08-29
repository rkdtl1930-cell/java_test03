package ch10;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		
		for(int i = 0 ; i < v.size() ; i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
