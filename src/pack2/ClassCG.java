package pack2;
/*
 	Given two strings, a and b, return the result of putting them together in the order ab-ba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

	makeAbba("Hi", "Bye") ? "HiByeByeHi"
	makeAbba("Yo", "Alice") ? "YoAliceAliceYo"
	makeAbba("What", "Up") ? "WhatUpUpWhat"
	
	public String makeAbba(String a, String b)
	{
	    // write ur logic here  
	}
 */

public class ClassCG 
{
	public String makeAbba(String a, String b)
	{
	    return a+b+b+a;  
	}
	public static void main(String[] args) 
	{
		ClassCG aobj = new ClassCG();
		String result=aobj.makeAbba("Hi", "Bye");
		System.out.println(result);
	}
}
