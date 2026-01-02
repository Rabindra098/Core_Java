package org.pattern;

public class Pattern05 {
	public static void main(String[] args) {
		int n = 4;
		for (int i = n; i >= 1; i--) {
		    for (int s = i; s < n; s++) 
		    	System.out.print(" ");
		    for (int j = 1; j <= (2 * i - 1); j++) 
		    	System.out.print("*");
		    System.out.println();
		}

	}
}
