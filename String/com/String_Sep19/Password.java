package com.String_Sep19;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%^&*_-]).{4,8}"; 
		
		
		String s="Tg!159000";
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		
		if(m.matches()) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
		
		
	}

}
