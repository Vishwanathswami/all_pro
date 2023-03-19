package arrayprograming;

public class DoubleElements {
	
	public static void main(String [] args) {
		int vish []= {11,12,13,14,15,16,11,12,13,14,15};
		
		for(int i=0;i<vish.length;i++) {
			for(int j=i+1;j<vish.length;j++) {
				if(vish[i]==vish[j]) {
					System.out.print(vish[i]+" ");
				}
			}
		}
		
	}

}
