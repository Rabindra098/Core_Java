package com.String_Sep19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IndianMobileNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="[6789][0-9]{9}"; 
		
		//String s="0123456789";//Invalid
		String s="653289446;";
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		
		if(m.find()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		
	}

}
