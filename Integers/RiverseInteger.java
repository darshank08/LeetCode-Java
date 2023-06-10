/**Question
 * Given a signed 32-bit integer x return x with its digits reversed. If reversing
 * x causes the value to go outside the signed 32-bit integer range, then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers(signed or unsigned).
 */

package Integers;

public class RiverseInteger {

	public static int reverse(int x) {
		int rev = 0;
		int max = Integer.MAX_VALUE; //2147483647
		int min = Integer.MIN_VALUE; //-2147483648
		while ( x!=0 ) {
			int lastdigit = x % 10;
			
			if(rev > max/10 || (rev == max/10 && lastdigit > 7)) {
				return 0;
			}
			if(rev < min/10 || (rev == min/10 && lastdigit < -8)) {
				return 0;
			}
			
			rev = rev * 10 + lastdigit;
			x = x / 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		System.out.println(reverse(123));

	}

}
