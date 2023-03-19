package arrayprograming;

public class DesendingArray {
	
	public static void main(String[] args) {
		int temp;
		int v[]= {125,78,6566,148,232,456,51,654,354,3244,14554,221,0,554,544,20,22,45}; 
		
		for(int i=0;i<v.length;i++) {
			for(int j=i+1;j<v.length;j++) {
				if(v[i]<v[j]) {
					temp=v[i];
					v[i]=v[j];
					v[j]=temp;
					
				}
			}
		}
		for(int i=0;i<v.length;i++)
			System.out.print(v[i] +" ");
		}

}
