package com.String_Sep18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExx3SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exp="[0-9]"; //"[^a-z A-Z]" or "\\d"
		
		String s="ab3bbb4aabbabaaab77babb9a";
		int sum=0;
		
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		
		while(m.find()) {
			sum+=Integer.parseInt(m.group());
		}
		System.out.println(sum);
		
	}

}
