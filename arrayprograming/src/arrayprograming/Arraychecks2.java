package arrayprograming;
import java.util.Arrays;

public class Arraychecks2 {
	
	public static void main(String []args) {
		int a[]= {184,14,46841,654,684,68484,44,4184,8465,44,84,51,4,51,8,468,484,56461,8184,5184,48,487,84878,484,546};
		
		Arrays.sort(a);
		
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]+" ");
		
	}
	

}
