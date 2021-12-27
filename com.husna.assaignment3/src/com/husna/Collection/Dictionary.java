package com.husna.Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Dictionary {

	public static void main(String[] args) {
		Map<String,String> map=new TreeMap<String,String>();
		map.put("Concrete","A method wich has an implimentation");
		map.put("Factory","A method which has Object creation logic");
		map.put("Recursion","Process in which method calss itself continously");
		map.put("Array","An Object which contains elements of similar data types");
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a word");
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			String word=scn.next();
			String value=map.get(word);
			System.out.println("Meaning of given word is : "+value);
		}
	}

}
