package methods;

public class CheckingMain {
	
	//to calling static method into main method
	
	public static void vish() {
		System.out.println("vishwanath is running");
	}
	
	public static void mafia() {
		int a = 20;
		System.out.println("a="+a);
		vish();
	}
	 
	public static void main(String []args) {
		
	mafia();
	
	}
	
}
