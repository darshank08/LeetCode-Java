/** Question
 * Given a non empty array of integers nums, every element appears twice except
 * for one. Find the single one.
 * You must implement a solution with a linear runtime and use only constant extra space.
 * 
 */

package Integers;

public class SingleNumber {
	
	public static int Number(int[] nums) {
		int ans = nums[0];
		for(int i=1; i < nums.length; i++) {
			ans = ans ^ nums[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(Number(nums));

	}
}

//Time complexity : 0(n)
//Space complexity : 0(1)
