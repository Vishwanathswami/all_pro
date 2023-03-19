package vish;

public class Ifelse {
	public static void Ifelse(int math,int phy,int chem,String student) {	
System.out.println("student name="+student+ "\n" +"math=" +math+ "\n"+"phy=" +phy+ "\n"+"chem=" +chem);
System.out.println("total marks=" +(math+phy+chem));
if(math<40 || phy<40|| chem<40|| (math+phy+chem)<120)
	System.out.println(student+ "is fail"+"\n");
else
	System.out.println( student+  "is pass"+"\n");
	}
 public static void main(String [] args) {
	
	 Ifelse(78,55,67,"avdhut");
	 Ifelse(40,39,78,"raju");
	 Ifelse(68,52,99,"joy");
 }
}
