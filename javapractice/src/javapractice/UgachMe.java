package javapractice;


public class UgachMe {
	public static void main(String[] args) {
		String s ="asdfg125!@#vCRTYJNaddjhbyd1848!@$bdbhvgvCRFAVGGVVHbchc745c4c5x4";
String ss=s.replaceAll("[^A-Za-z0-9]", "");
String sss=ss.replaceAll("[A-Za-z]", "");
System.out.println(sss);


int sum=0;
for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	if(Character.isDigit(ch)) {
		int a=Integer.parseInt(s.valueOf(ch));
		sum=sum+a;
	}
}
System.out.println(sum);
	}

}