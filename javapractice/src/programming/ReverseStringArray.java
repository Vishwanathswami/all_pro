package programming;

public class ReverseStringArray {

	public static void main(String[] args) {
		String str = "avdhut ram shyamvadapav burger lemon";
		String[] words = str.split("\\s");
		String revstr = "";
		for (String word : words) {
			String revword = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revword = revword + word.charAt(i);
			}
			revstr = revstr + revword + " ";
		}
		System.out.println(revstr);
	}
}
