package practice;

public class MyPractice {
	
	int a = 20;
	static int b = 30;
	int c = a+b;
	 
	public static void m1() {
		MyPractice obj = new MyPractice();
		System.out.println(obj.a);	
		
		System.out.println(obj.c);
}
	
	public void m2() {
		
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		System.out.println(b);
		m1();
		
		MyPractice obj1 = new MyPractice();
		obj1.m2();
		
	
		
	}
}
