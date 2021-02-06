package org.practice;
import java.util.HashSet;

import java.util.Set;


public class CollectionSet {

	public static void main (String[]args) {
		Set<Integer> si=new HashSet<Integer>();
		si.add(10);
		si.add(50);
		si.add(30);
		si.add(90);
		 System.out.println(si);
		 
				 // iterate the values
		 
		 for(Integer x:si) {
			 System.out.println(x);
		 }
		
		
		
		
	}
}
