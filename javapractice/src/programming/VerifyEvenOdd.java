package programming;

import java.util.Scanner;

public class VerifyEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int input=sc.nextInt();
		if(input%2==0) 
			System.out.println("no is even");
		
		else
			System.out.println("no is odd");
	}

}
