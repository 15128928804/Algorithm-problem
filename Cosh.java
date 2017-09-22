package com.tjgjk.common.des;

public class Cosh {

	public static void main(String[] args) {
		
		int[] nums = {1,1,1};
		System.out.println(new Cosh().rob(nums));
	}
	
	/** 石头游戏  **/
	/*public static boolean canWinNim(int n) {
	    
		return(n % 4 != 0);
		
	}*/
	
	public int rob(int[] nums) {
		
		int num = 0;
		int sum = 2;
		if(nums.length == 0) {
			return num;
		} else if(nums.length <= 1) {
			return nums[0];
		} else if(nums.length <= 2) {
			if(nums[0] > nums[1]) {
				num += nums[0];
			} else {
				num += nums[1];
			}
			return num;
		} else {
			for(int i = 0; i < nums.length;i++) {
				if(num == i) {
					num += nums[i];
					
				} else if(sum % i != 0){
					num += nums[i];
					
				} 
			}
		}
		
		return num;
    }
}
