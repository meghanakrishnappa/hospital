package com.xworkz.xworkzapp;

public class Tester {
	public static void main(String args[])
	{
		
		String str=
				"Bangalore is also called as it hub Banglore recently awarded best city to live Bangalore is also called as green city Bangalore is capital city of karnataka";
		String[] split=str.split("\\s+");
		System.out.println("No of words : " +
		           split.length);
	}
}


