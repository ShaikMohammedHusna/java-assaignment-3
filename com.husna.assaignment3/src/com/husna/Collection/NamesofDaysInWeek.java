package com.husna.Collection;
import java.util.ArrayList;
import java.util.List;

public class NamesofDaysInWeek {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("SunDay");
		list.add("MonDay");
		list.add("TuesDay");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		for(String s:list)System.out.println(s);
		System.out.println("=====================");
		System.out.println("Length of Collection : "+list.size());
		String arr[]=new String[list.size()];
		for(int i=0;i<list.size();i++) arr[i]=list.get(i);
		System.out.println("=====================");
		for(String s:arr) System.out.println(s);
	}
}

