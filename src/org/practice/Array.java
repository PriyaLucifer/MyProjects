package org.practice;


import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		// create a object using arraylist with datatype with the help of generics
		
		ArrayList<Integer> li= new ArrayList<Integer>();
		li.add(12);
		li.add(56);
		li.add(67);
		li.add(90);
		

System.out.println(li);
int i=li.size();
System.out.println(i);

for(i=0; i<li.size(); i++) {
	System.out.println(li.get(i));
}
		
		
	}
	
}
