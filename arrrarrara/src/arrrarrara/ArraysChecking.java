package arrrarrara;



public class ArraysChecking {
	public static void main(String[] args) {
		
		int[] a= {12,58,46,79,12,12,58,35,48,23,66,15};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
