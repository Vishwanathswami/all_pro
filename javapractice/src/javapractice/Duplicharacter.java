
package javapractice;

import java.util.HashSet;
import java.util.Set;

public class Duplicharacter {
	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'd', 'a', 'b', 'c', 'e', 'c', 'r', 'a', 'r' };
		Set<Character> set = new HashSet<>();
		Set<Character> duplicate = new HashSet<>();

		for (char c : a) {
			if (!set.add(c)) {
				duplicate.add(c);
			}

		}
		for (Character aa : duplicate) {
			System.out.println(aa);
		}

	}

}
