package programming;

public class CamelCaseReverse {
	
	public static void m1() {
		String s="today is monday";
		String [] words=s.split("\\s");
		String output="";
		for(int i=words.length-1;i>=0;i--) {
			String word=words[i];
			output=output+word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase()+" ";
		}
		System.out.println(output.trim());

	}
	
	
	
	
	public static void main(String[]args) {
		String s="today is monday";
String str[]=s.split("\\s");
String output="";
for(int i=str.length-1;i>=0;i--) {
	String temp="";
	for(int j=0;j<(str[i].length());j++) {
		if(j==0) {
			temp=temp+(str[i].charAt(j)+"").toUpperCase();
		}
		else {
			temp=temp+(str[i].charAt(j)+"").toLowerCase();
		}
	}
	output=output+temp+" ";
}
System.out.println(output);
	}

}
