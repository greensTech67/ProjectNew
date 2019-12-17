package org.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mp {

	public static void main(String[] args) {
		
		Map<Integer, String> li = new LinkedHashMap<Integer, String>();
	   //To add the values to the Map
		
		li.put(10, "Saranya");
		li.put(20, "Razeem");
		li.put(30, "Vel");
		li.put(40, "Vel");
		li.put(10, "Raj");
		
		System.out.println(li);
		
		//To get the particular value
		
		String st = li.get(20);
		System.out.println(st);
		
		//To check whether particular key is present or not
		
		boolean ck = li.containsKey(10);
		System.out.println(ck);
		
		//To check whether particular value is present or not
		
		boolean cv = li.containsValue("Vel");
		System.out.println(cv);
		
		//To get the keys alone
		
		Set<Integer> ks = li.keySet();
		System.out.println(ks);
		
		//To get the keys alone
		
		Collection<String> v = li.values();
		System.out.println(v);
		
		//IIteration
		
		Set<Entry<Integer, String>> es = li.entrySet();
		
		for(Entry<Integer,String> x : es) {
		
			//To Iterate the Map 
		System.out.println(x);
		//Iterate the Only Keys
		System.out.println(x.getKey());
		//Iterate only the Value
		System.out.println(x.getValue());
		
		
	}

}
}
