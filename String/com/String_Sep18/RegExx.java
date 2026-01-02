package com.String_Sep18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="ab";
		String s="abbbbaabbabaaabbabba";
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		
//		while(m.find()) {
//			System.out.println(exp);
//		}
		System.out.println(exp);
		System.out.println(exp);
		
		System.out.println(exp);
		System.out.println(exp);
		System.out.println(exp);
	}

}
