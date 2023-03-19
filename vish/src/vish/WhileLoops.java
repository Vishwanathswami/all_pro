package vish;

public class WhileLoops {
	public static void main(String [] args) {
		int a = 1;
		while(a<100) {
			a++;
			if(a%2==0)
				continue;
			System.out.print(a+" "); 
			
		}
	
	}

}
