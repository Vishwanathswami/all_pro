package programming;

public class SwappingNumber {
	public static void main(String[] args) {
	int a=10;
	int b=20;
//	System.out.println(a+"  "+b);
//	int t=a;
//	a=b;
//	b=t;
//	System.out.println(a+"  "+b);
		
//		a=a+b;
//		b=a-b;
//	a=a-b;
//	System.out.println(a+"  "+b);
//	a=a*b;
//	b=a/b;
//	a=a/b;
//	System.out.println(a+"  "+b);
//	
//	a=a^b;
//	b=a^b;
//	a=a^b;
//	System.out.println(a+"  "+b);
	
	b=a+b-(a=b);
	System.out.println(a+"  "+b);
	
	}
}
