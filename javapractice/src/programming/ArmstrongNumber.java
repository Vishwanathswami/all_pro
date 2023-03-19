package programming;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int a= sc. nextInt();
		int hold = a;
		int re =0;
		int res=0;
		while(hold!=0) {
			re=hold%10;
			res=res+(re*re*re);
			hold=hold/10;
		}
		if(res==a)
			System.out.println("arm");
		else
			System.out.println("not");
	}

	
}
