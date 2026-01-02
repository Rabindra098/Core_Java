package com.String_Sep11;
public class Pr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="HELLOWORLD";
		char ch[]=s.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			char count='1';
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=++count;
				}
			}
			if(count!='1') { //This means for which characters the count is not 1
							//here for 'L' and 'O'.
				ch[i]='1';
			}
		}
		System.out.println(ch);
		
	}

}
