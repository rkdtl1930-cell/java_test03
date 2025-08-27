package ch09.aa;

public class Problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			boolean flag = false;
			int[] nums = new int[3];
			for(int i = 0; i < 3; i++) {
				nums[i] = (int)(Math.random()*3+1);
				System.out.print(nums[i]+" ");
				if(nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[0]) {
					flag =true;
				}
			}
			System.out.println();
			if(flag) {
				System.out.println("성공");
				break;
			}
		}
	}

}
