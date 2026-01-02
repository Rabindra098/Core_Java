package com.String_Sep12;

public class Pr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdababba";
		String key="ab";
		int pair=0;
		
		for(int i=0;i<s.length();i++) {
			for(int j=i+2;j<s.length();j++) {
				if(s.substring(i,j).equals(key)) {
					pair++;
				}
			}	
		}	
		System.out.println(pair);
	}

}
