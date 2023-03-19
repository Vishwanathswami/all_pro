package programming;

public class PrintOnlyNoFrmString {
	public static void main(String[]args) {
		String s ="asdfg125!@#vCRTYJNaddjhbyd1848!@$bdbhvgvCRFAVGGVVHbchc745c4c5x4";

//		s=s.replaceAll("[^a-zA-Z0-9]", "");
//		s=s.replaceAll("[a-zA-Z]","");
//		System.out.println(s);
		int sum =0;
		for(int i=0;i<s.length();i++) {
			char temp= s.charAt(i);
			if(Character.isDigit(temp)) {
			int a=	Integer.parseInt(s.valueOf(temp));
				sum=sum+a;
			}
		}
		System.out.println(sum);
	}

}
