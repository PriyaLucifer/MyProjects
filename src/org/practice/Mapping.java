package org.practice;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping {

	public static void main(String[] args) {
		
		Map<Integer,String> mp=new LinkedHashMap<Integer,String>();
		mp.put(10,"oracle");
		mp.put(30,"java");
		mp.put(10,"selenium");
		mp.put(20,"python");
		mp.put(40, "testing");
		System.out.println(mp);
		
		//iterate values and keys using enhanced for loop
		
		Set<Entry<Integer,String>>en=mp.entrySet();
		for (Entry<Integer,String> x : en) {
			System.out.println(x);
		}
		
		// to print only keys
		
		Set<Integer> ke=mp.keySet();
		for(Integer y:ke) {
			System.out.println(y);
		}
		
		//to print onlyvalues
		
		Collection<String> va=mp.values();
		for(String z:va) {
			System.out.println(z);
		}
				
		
		
		
		
	}
	
	
}
