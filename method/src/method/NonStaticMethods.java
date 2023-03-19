package method;

public class NonStaticMethods {
	
	// TO CALL NON STATIC METHOD INTO ANOTHER STATIC METHOD
	
	public static void vish() {
		System.out.println("vishwanath");
		  NonStaticMethods abc = new NonStaticMethods();
  		abc.vishaaa();
  		 
	}
	
      public void vishaaa() {
    	
    	  System.out.println("nagnath");
    	
    	  
	}
      public static void main(String []args) {
    	
    	  vish(); 
    		 
    	
		
    	  
    		}
}
