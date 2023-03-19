package programming;

public class DuplicateArray {
	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'd', 'a', 'b', 'c', 'e', 'c', 'r', 'a', 'r' };
		for (int i = 0; i < a.length; i++) {

			for (int j =i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicate char" + ":" + a[i]);
				
					break;
				}
			}

			

		}
		
	}

}
