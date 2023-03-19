package javapractice;

public class DuplicateChar {
	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'd', 'a', 'b', 'c', 'e', 'c', 'r', 'a', 'r' };
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != ' ') {
					count++;

					a[j] = '0';

				}
			}
			if (count > 1 && a[i] != '0') {
				System.out.println("duplicate char  " + a[i]);
			}
		}

	}

}
