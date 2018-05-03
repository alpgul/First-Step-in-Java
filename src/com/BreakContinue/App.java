package com.BreakContinue;

public class App {

	/**
	 * break: breaks out of the loop so leaves the loop
	 * continue: jumps to the next iteration
	 * 
	 */
	
	public static void main(String[] args) {
		
		int[] nums = {1,5,3,7,8,9,2};
		
		for(int i=0;i<nums.length;i++) {
			
			if( nums[i] == 7 ) {
				continue;
			}
			else if( nums[i] == 9 ) {
				break;
			}
			
			System.out.println(nums[i]);
		}
		
	}
}
