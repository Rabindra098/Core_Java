package com.String_Sep13;

public class ScndMinOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="javadddddeeeeeeeeva";
		String s2="";
		int minCount=s1.length();
		int ScndminCount=s1.length();
		
		char ScndminChar=' ';
		char minChar=' ';
		while(s1.length()>0) {
			
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			
			
			
			if(count<minCount) {
				ScndminCount=minCount;
				minCount=count;
				ScndminChar=minChar;
				minChar=ch;
			}
			else {
				if(count<=ScndminCount && count!=minCount) 
				{
					ScndminCount=count;
					
					ScndminChar=ch;
				}
			}
			s1=s2;
		}
		//System.out.println(minChar+" = "+minCount);
		System.out.println(ScndminChar+" = "+ScndminCount);
		
		
	}

}
