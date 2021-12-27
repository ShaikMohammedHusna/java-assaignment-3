package com.cd.colctns;
import java.util.*;

public class ArrayListSorting {
	public static void main(String args[]){
		   ArrayList<Cd> arraylist = new ArrayList<Cd>();
		   arraylist.add(new Cd("Shreya","Hasi Ban Gaye"));
		   arraylist.add(new Cd("Arjith Singh","Tera Yaar Hoon My"));
		   arraylist.add(new Cd("Jubin Nautiyal","Raatan Lambiyan"));

		   Collections.sort(arraylist,Cd.SingerNameComparator);
		   for(Cd str:arraylist){
				System.out.println(str);
		   }
		   Collections.sort(arraylist,Cd.TitleComparator);
		   for(Cd str:arraylist){
				System.out.println(str);
		   }
	     }
}
