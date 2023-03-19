package programming;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int num=sc.nextInt();
		int org_num=num;
		int rev=0;
		while(num!=0) {
		rev=	rev*10+num%10;
		num=num/10;
		}
		if(org_num==rev)
			System.out.println(org_num+":"+"palindrome");
		else
			System.out.println(org_num+":"+"not");
	}
}
