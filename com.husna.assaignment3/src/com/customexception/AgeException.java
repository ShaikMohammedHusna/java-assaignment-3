package com.customexception;

public class AgeException extends StoringName{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) throws AgeCustExcep{
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i].equals(this.name))
			throw new AgeCustExcep("Name already Exists");
		}
		this.name = name;
	}
	public void setAge(int age) throws AgeCustExcep{
		if(age<18 || age>60)
			throw new AgeCustExcep("Age is invalid");
		this.age = age;
	}
	

	public void oneMoreSetAge(int age) {
		try {
		if(age<18 || age>60)
			throw new AgeCustExcep("Age is invalid");
		this.age=age;
		}
		catch(AgeCustExcep ex) {
			System.out.println("please enter Valid age");
		}
	}
	public void oneMoreSetName(String name) {
		try {
			for(int i=0;i<arr.length-1;i++) {
			if(arr[i].equals(this.name)) {
				throw new AgeCustExcep("Name already Exsist");
			}
			this.name=name;
			}
		}
		catch(AgeCustExcep ex) {
			System.out.println(" Name already exists Please enter new name");
		}
	}
	
}
