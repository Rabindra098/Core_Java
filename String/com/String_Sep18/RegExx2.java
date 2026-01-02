package com.String_Sep18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="[.]";
		String s="ab.bbbaabba.baa.abbabba";
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		
		while(m.find()) {
			System.out.println(m.group());
			System.out.println("____________");
			System.out.println(exp);
		}
	}

}
