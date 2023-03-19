package javapractice;

import java.util.HashMap;
import java.util.Set;

public class visgafgah {
	public static void main(String[] args) {
		// Duplicate char from given Array
		char[] a = { 'a', 'b', 'd', 'a', 'b', 'c', 'e', 'c', 'r', 'a', 'r' };
		HashMap<Character,Integer> smap= new HashMap<Character,Integer>();
		for(char str:a)
			if(smap.containsKey(str))
				smap.put(str, smap.get(str)+1);
			else
				smap.put(str, 1);
		Set<Character> keys= smap.keySet();
		for(char key:keys)
			if(smap.get(key)>1)
				System.out.println(key);
           
		
	}
	}

