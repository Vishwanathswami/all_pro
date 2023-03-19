package assignment;

public class Assignm {
	
	
	public Assignm(int math, int phy, int chem, String StudentName) {
		System.out.println("total marks="+(math+phy+chem));
		System.out.println("marks of " +StudentName+ "\n"+"math "+math+ "\n"+"phy "+phy+ "\n"+"chem "+chem);

	if(math<40 || phy<40 || chem<40 || (math+phy+chem<120) ) 
	System.out.println( StudentName+   "is fail \n");
	else
		System.out.println( StudentName+  "is pass \n");	
	}
	public static void main(String [] args) {
		
		
		new Assignm(45,78,65,"avdhut");
		new Assignm(39,89,47,"raju");
		new Assignm(75,78,65,"joy");
	}

}
