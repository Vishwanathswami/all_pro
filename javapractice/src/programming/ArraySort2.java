package programming;

public class ArraySort2 {
	public static void main(String[] args) {
		int temp=0;
		int[] a = {12,15,35,44,77,88,957,74,58,66,88,54,55,666,52,58,2,8,2,8879,5};

		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}

		}
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");

	}

}
