package com.String_Sep19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="[a-z0-9]+@[ge]mail.com"; 
		
		String s="marcmarquez789@gmail.com";
	
		
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
