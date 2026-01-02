package com.String_Sep17;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is easy";
		String str[]=s.split("is");
		for(String elements:str) {
			System.out.println(elements);
		}
	}

}
