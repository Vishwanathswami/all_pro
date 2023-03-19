package arrayprograming;

public class AscendingOfArray {
	
      public static void maim(String []args){
    	  int hold;

       int a[]={111,154,15,1,54,15151,44,15};
     
       for(int i=0;i<a.length;i++) {
    	   for(int j=i+1;j<a.length;j++) {
    		   if(a[i]>a[j]) {
    			   hold= a[i];
    			   a[i]=a[j];
    			   a[j]=hold;
    		   }
    		   
    	   }
       }
       for(int i=0;i<a.length;i++)
          System.out.println(a[i]+" ");
}
}
