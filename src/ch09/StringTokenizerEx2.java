package ch09;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3+5";
		StringTokenizer st1 = new StringTokenizer(str,"+-*/%",true);
		int num1 = Integer.parseInt(st1.nextToken());
		String op = st1.nextToken();
		int num2 = Integer.parseInt(st1.nextToken());
		
		switch(op){
			case "+" :
				System.out.println(num1+num2);
				break;
		}
		
		
		System.out.println(num1+op+num2);
		
		String names = "홍길동, 김다혜,진영랑 이정은";
		String[] arrStr = names.split(", ");
		StringTokenizer st = new StringTokenizer(names, ", ",true); // 마지막 true 는 구분자도 토큰으로 만듬
		for(int i = 0; i < arrStr.length ; i++) {
			System.out.println(arrStr[i]);
		}
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
