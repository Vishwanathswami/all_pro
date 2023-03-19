package programming;

public class OnlyNo {
	public static void main(String[] args) {
		String s = "sasjsjj2q8w2djkj##@^@*WIW@WH88ijjjsoHSdkdsk5845dsd5fhhhasssh267623&^&&&27^&82u2uhjsdG55^*I*D*SS$@Y&J";
String a= s.replaceAll("[^a-zA-Z0-9]", "");
String b=a.replaceAll("[a-zA-Z]", "");
System.out.println(b);
	}

}
