package ch10;

import java.util.*;

public class HashMapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<Integer, Employee> map = new HashMap<>();
		map.put(1, new Employee(1, "홍길동", "영업부", 500));
		map.put(2, new Employee(2, "김길동", "기획부", 300));
		map.put(3, new Employee(3, "이길동", "영업부", 200));
		map.put(4, new Employee(4, "박길동", "홍보부", 400));
		map.put(5, new Employee(5, "최길동", "홍보부", 300));
		
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key +" : "+map.get(key));
		}
		while(true) {
			System.out.println("사원의 이름을 입력하세요");
			String key = sc.next() ;
			if(key.equals("그만")) {
				break;
			}
			boolean flag = map.containsKey(key);
			if(flag)
				System.out.println(map.get(key));
			else
				System.out.println("찾는 데이터가 없습니다.");
		}

	}

}
