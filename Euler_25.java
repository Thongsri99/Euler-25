import java.math.*;
public class Euler_25 {

	public static void main(String[] args) {
		BigInteger one = BigInteger.valueOf(1);
		BigInteger two = BigInteger.valueOf(1);
		BigInteger sum = BigInteger.valueOf(0);
		String number;
		
		int count = 0;//Amount of digits
		
		int running = 0; //Answer wanted
		long start = System.currentTimeMillis();
		while (count != 1000){
			//The following lines will calculate the Fibonacci sequence.
			one = two;
			two = sum;
			sum = one.add(two);
			
			//The following will calculate the amount of digits.
			number = sum.toString();
			count = number.length();
			
			running++; //This will keep track of the term.

		}
		System.out.println(running + " in " + (System.currentTimeMillis() - start) + " ms");
	}
}
