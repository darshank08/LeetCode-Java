/** Question
Write a program that outputs the String representation of numbers from 1 to n But for multiples of three it should print "Fizz" instead of the number and for 
multiples of five print "Buzz". For numbers which are multiples  of both three and five print "FizzBuzz".
**/

package Integers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	
	public List<String> Fizz_Buzz(int n){
		List<String> list = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%5==0) {
				list.add("FizzBuzz");
			}else if(i%3==0) {
				list.add("Fizz");
			}else if(i%5==0) {
				list.add("Buzz");
			}else {
				list.add(Integer.toString(i));
			}
		}
		return list;
	}
	public static void main(String arg[]) {
		FizzBuzz obj = new FizzBuzz();
		System.out.println(obj.Fizz_Buzz(15));
		
	}
}

//Time complexity : 0(n)
//Space complexity : 0(n)

