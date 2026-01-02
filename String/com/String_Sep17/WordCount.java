package com.String_Sep17;

public class WordCount {
	public static void main(String[] args) {
		String s="java    is               easy";
		String str[]=s.trim().split("\\s+");
		System.out.println(str.length);
	}
}
