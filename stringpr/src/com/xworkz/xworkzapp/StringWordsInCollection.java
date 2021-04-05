package com.xworkz.xworkzapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringWordsInCollection {

	public static void main(String[] args) {
		String words=
				"Bangalore is also called as it hub Banglore recently awarded best city to live Bangalore is also called as green city Bangalore is capital city of karnataka";
		String words1[] = words.split(" ");
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(words1);
		for(String s: al){
		   System.out.println(s);
		}
	}	

}
