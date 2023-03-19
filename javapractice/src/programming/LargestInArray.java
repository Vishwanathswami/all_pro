package programming;

import java.util.ArrayList;
import java.util.TreeSet;

public class LargestInArray {
	public static void main(String[] args) {
		int ar[] = {12,55,26,8,66,74,89,5,6,78,559,9,5,484,54564,1154,55,154,515,184,51511,8451,5};
TreeSet tr = new TreeSet();
for(int num :ar)
	tr.add(num);
ArrayList al = new ArrayList(tr);
System.out.println(tr);
System.out.println("2nd lagest no="+al.get(al.size()-2));
	}

}
