package com.husna.Collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TelephoneDirectory {

	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<String,Integer>();
		map.put("ABC",785785788);
		map.put("DEF",784645465);
		map.put("MNO",984657457);
		map.put("XYZ",879565875);
		Set set=map.keySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Object key=iterator.next();
			Integer value=map.get(key);
			System.out.println(key+" "+value);
		}
	}
}
