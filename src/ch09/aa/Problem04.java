package ch09.aa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String add = s.trim();
		StringTokenizer st = new StringTokenizer(add, "+ ");
		int count = st.countTokens();
		int[] nums = new int[count];
		for(int i = 0; i < count ; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			}
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("합은 "+sum);
		}

}
