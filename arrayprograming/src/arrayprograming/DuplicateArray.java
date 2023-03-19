package arrayprograming;

import java.util.Arrays;

public class DuplicateArray {
	public static void main(String[] args) {
		int a[]= {14,56,85,25,1};
		int b[]= {1,2,3,4,5};
		int c[]= {14,56,85,25,1};
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(a, c));
		
	}
	

}
