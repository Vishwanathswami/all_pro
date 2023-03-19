package programming;

public class CountSpace {
	public static void main(String[] args) {
		String s=" vi sh w a na th ";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char str=s.charAt(i);
			if(str==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
