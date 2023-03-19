package programming;

public class RemoveUpperCase {
public static void main(String[] args) {
	String s ="ashab!@#$HWGUUNCNbhubc52534@#$bhdfb nafughug784515fg4v8s@bcvjKB15135135SF515F5GG5GDWRGBGHTHB15";
	s=s.replaceAll("[^a-z0-9]", "");
	s=s.replace(" ", "");
	System.out.println(s);
}
}
