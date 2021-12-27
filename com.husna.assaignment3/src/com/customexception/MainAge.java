package com.customexception;

import java.util.Scanner;
public class MainAge {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	AgeException aOb=new AgeException();
	System.out.println("Enter the name");
	String name=scanner.next();
	try {
		aOb.setName(name);
	} catch (AgeCustExcep e) {
		System.out.println("Already existing name");
	}
	
	aOb.oneMoreSetName(name);
	
	System.out.println("Enter Age : ");
	int age=scanner.nextInt();
	try {
		aOb.setAge(age);
		System.out.println("Person is eligible for voting");
	} catch (AgeCustExcep e) {
		System.out.println("As person age is "+age+" so not eligible for voting");
	}
	
	aOb.oneMoreSetAge(age);
	
	
	
}
}