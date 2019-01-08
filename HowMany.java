package rsn170330.sp06;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 01: How many Two Sum pairs
 * 
 * @author Rahul Nalawade
 * 
 * Date: January 02, 2019
 */
public class HowMany {
	
	/**
	 * DYNAMIC PROGRAMMING
	 * Given an unsorted array A of integers, might containing 
	 * duplicates, and an integer X, find how many pairs of 
	 * elements of A sum to X:
	 * 
	 * E.g. How many indexes i, j (with i != j) are there 
	 * with A[i] + A[j] = X? 
	 * If A = {3,3,4,5,3,5} then howMany(A,8) returns 6
	 * 
	 * @param A the input array of integers 
	 * @param X the target number
	 * @return number of pairs summing up to X
	 */
	static int howMany(int[] A, int X) {
		// map: maps and integer to it's count in array A
		Map<Integer, Integer> map = new HashMap<>();
		
		// Initializing all {e, X-e} pairs. So, that 
		// result += is updated correctly.
		for (int e : A) {
			map.put(e, 0);
			map.put(X - e, 0);
		}
		
		int result = 0;
		// Dynamically stores results in result 
		// after each integer is visited
		for (int e : A) {
			result += map.get(X - e); // count of all visited (X - e)
			
			map.put(e, map.get(e) + 1); // increment count as you 
			// see the integer more than once
		}
		
		return result;
	}

	public static void main(String[] args) {
		int[] arr = {3, 3, 4, 5, 3, 5, 4}; 
		int X = 8;
		
		System.out.println("howMany(A,8) = " + howMany(arr, X));
	}
}
