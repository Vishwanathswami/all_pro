package programming;

public class ReverseStringRemoveSpace {
	public static void main(String[] args) {
		String a = "auto mation";
		String s= a.replace(" ", "");
		String str="";
		for(int i=s.length()-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		System.out.println(str);
	}

}
