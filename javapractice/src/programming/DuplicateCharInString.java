package programming;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharInString {
	public static void main(String[] args) {
		String a = "ajhddhhdhgdwdgdwhuhjzzzyswtdqudidnjbhsgsdgsdddkjdhshqsqkdkfjds11ddhdwhdwwd3w3wdwdwhwdwhjwdwdhwwgyww";
		char [] ar=	a.toCharArray();
		HashMap<Character, Integer>smap=new HashMap<Character, Integer> ();
		for(char str1:ar)
			if(smap.containsKey(str1))
				smap.put(str1, smap.get(str1)+1);
			else
				smap.put(str1, 1);
		
		Set<Character> keys=smap.keySet();
		for(char key:keys)
		if(smap.get(key)>1)
			System.out.println(key+":"+smap.get(key)+" ");
		
				
	}
}
