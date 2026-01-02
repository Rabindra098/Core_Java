package com.String_Sep12;

public class Pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String bigPallindrome="";
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+3;j<s.length();j++) {
				String str=s.substring(i,j);
				
				if(isPallindrome(str)) {
					if(str.length()>bigPallindrome.length()) {
						bigPallindrome=str;
					}
				}
			}
		}
		System.out.println(bigPallindrome);		
	}
	public static boolean isPallindrome(String s) {
		int i=0;
		int j=s.length()-1;
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
