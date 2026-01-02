package com.String_Sep17;

//import java.util.Arrays;

public class OccuranceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="             java       is      is           very     very easy java   ";
		String str[]=s.split(" ");
		int sum=1;
		
		for(int i=0;i<str.length;i++) {
			int count=1;
			if(str[i].equals("")) continue;
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="";
					sum+=count;
				} 
			}
			System.out.println(str[i]+" "+count);
			
		}
		System.out.println(sum);
	}

}
