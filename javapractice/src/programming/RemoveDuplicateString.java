package programming;

import java.util.LinkedHashSet;

public class RemoveDuplicateString {
	public void RemoveDuplicate(String str) {
		LinkedHashSet<Character>smap= new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) {
			smap.add(str.charAt(i));
		}
		for(char ch:smap) {
			System.out.print(ch);
		}
	}
	public static void main(String[]args) {
		String str="vishwanathswami";
		RemoveDuplicateString ob= new RemoveDuplicateString();
		ob.RemoveDuplicate(str);
	}
}
