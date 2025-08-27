package ch09.aa;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userKor = "";
		String computerKor = "";
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>>");
			int user = sc.nextInt();
			int computer = (int)(Math.random()*3+1);
			if(user == 4) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			switch(user) {
			case 1:
				userKor = "가위";
				break;
			case 2:
				userKor = "바위";
				break;
			case 3:
				userKor = "보";
				break;
			default:
				System.out.println("입력 오류");
				break;
			}
			switch(computer) {
			case 1:
				computerKor = "가위";
				break;
			case 2:
				computerKor = "바위";
				break;
			case 3:
				computerKor = "보";
				break;
			}
			if(user >= 1 && user <= 3) {
				System.out.println("사용자 "+userKor+" : 컴퓨터 "+computerKor);
			}
			int result = user - computer;
			if(result == 0) {
				System.out.println("비겼습니다.");
			}
			else if(result == 1 || result == -2) {
				System.out.println("사용자가 이겼습니다.");
			}
			else if(result == -1 || result == 2) {
				System.out.println("사용자가 졌습니다.");
			}
		}
	}

}
