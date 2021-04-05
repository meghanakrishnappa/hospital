package com.xworkz.xworkzapp;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String words=
				"Bangalore is also called as it hub Bangalore recently awarded best city to live Bangalore is also called as green city Bangalore Bangalore is capital city of karnataka";
	            
	        words = Arrays.stream(words.split("\\s+")).distinct().collect(Collectors.joining(" ") );
	        
	        System.out.println(words);
	 
	    }

	}


