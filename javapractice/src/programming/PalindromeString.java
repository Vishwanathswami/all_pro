package programming;

public class PalindromeString {
public static void main(String[] args) {
	String s="MADAM";
	String hold=s;
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	if(hold.equals(rev))
		System.out.println("palindrome String"+" : "+ rev+"=="+s);
	else
		System.out.println("not palindrome String"+" : "+ rev+"!="+s);

}
}
