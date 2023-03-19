package accessspecifires2;

import accessspecifires1.AccessmodifiresClass1;

public class AccessmodifiresOutOfPackage    {
	
	public static void main(String [] args) {
		AccessmodifiresClass1 abc = new AccessmodifiresClass1();
		abc.m1();
	}

}
 class asd{
	 public static void main(String [] args) {
		 AccessmodifiresClass1 abc = new AccessmodifiresClass1();
			abc.m1();
		}
 }