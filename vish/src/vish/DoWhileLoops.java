package vish;

public class DoWhileLoops {
	public static void main(String [] ags) {
		int a = 100;
		do {
			a--;
			if(a==90||a==80||a==70||a==60||a==50) {
				continue;
			}
			
			System.out.print(a+" ");
		
		}while(a>=50);
	}

}

