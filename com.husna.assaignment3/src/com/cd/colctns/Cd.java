package com.cd.colctns;

import java.util.Comparator;

public class Cd  {
	private String singername;
	private String Title;
	public Cd(String singername, String title) {
		super();
		this.singername = singername;
		Title = title;
	}
	public String getSingername() {
		return singername;
	}
	public void setSingername(String singername) {
		this.singername = singername;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public static Comparator<Cd> SingerNameComparator = new Comparator<Cd>()
	{

		public int compare(Cd s1, Cd s2) {
		   String Singername1 = s1.getSingername().toUpperCase();
		   String Singername2 = s2.getSingername().toUpperCase();
		  
		   return Singername1.compareTo(Singername2);
		}
	};
	public static Comparator<Cd> TitleComparator = new Comparator<Cd>() 
	{

		public int compare(Cd t1, Cd t2) {
		   String Title1 = t1.getTitle().toUpperCase();
		   String Title2 = t2.getTitle().toUpperCase();
		   return Title1.compareTo(Title2);
		
		}
	};
		@Override
		public String toString() {
			return "Cd [singername=" + singername + ", Title=" + Title + "]";
		}
	}
	