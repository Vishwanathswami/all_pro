package programming;

public class ReverseString {
	
	public  void m1()  {
		String s ="vishwanath";
		char [] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
			System.out.print(ch[i]);
	}
	
	public void m2() {
		String s ="vishwanath";
		String str="";
		for(int i=s.length()-1;i>=0;i--)
			str=str+s.charAt(i);
			System.out.println(str);
		
	}
public static void main(String[] args) {
	ReverseString ab = new ReverseString();
	ab.m1();
	System.out.print(" ");
	ab.m2();
}
}
