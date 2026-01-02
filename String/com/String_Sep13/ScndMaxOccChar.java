package com.String_Sep13;

public class ScndMaxOccChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aajjjjvvvv";
		String s2="";
		int maxCount=0;
		int ScndmaxCount=0;
		char maxChar=' ';
		char ScndmaxChar=' ';
	
		while(s1.length()>0) {
			
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			
			if(count>maxCount) {
				ScndmaxCount=maxCount;
				
				ScndmaxChar=maxChar;
				
				maxCount=count;
				
				maxChar=ch;
			}
			else if((count>=ScndmaxCount && count!=maxCount)) {
				 {
					ScndmaxCount=count;
					
					ScndmaxChar=ch;
							}
			}
			s1=s2;
		}
		
		//System.out.println(maxChar+" = "+maxCount);
		System.out.println(ScndmaxChar+" = "+ScndmaxCount);
		
		
	}

}
