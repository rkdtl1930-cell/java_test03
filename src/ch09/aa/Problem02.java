package ch09.aa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			if(line.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			StringTokenizer st = new StringTokenizer(line, " ");
			int count = st.countTokens();
			System.out.println("어절 개수는 "+count);
			
		}
	}

}
