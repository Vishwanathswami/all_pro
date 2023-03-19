package inheritancepractice;

public class Child extends Parent    {
	
	static int b = 25;
	int c = 450;
	public  void m1() {
		System.out.println(c);
		System.out.println(super.c);
		System.out.println(super.b);
		System.out.println(b);
	}
	public static void m2() {
		System.out.println(b);
		System.out.println(Parent.b);
	}
	
	public static void main(String [] args) {
		Child ab = new Child();
		ab.m1();
		
	}
}
