/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
			
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    sc.nextLine();
	    while(T-->0){
		// sc.nextLine();
		String s = sc.nextLine();
		// APPROACH 1
		
		// char c[] = s.toCharArray();
		// for(int i = s.length()-1 ; i>=0 ; i--){
		// System.out.print(c[i]);
		// }
		
		
		// APPROACH 2
		// for(int i=s.length()-1; i>=0;i--){
		//     System.out.print(s.charAt(i));
		// }
		
		// APPROACH 3
		System.out.println(new StringBuilder(s).reverse().toString());
        
        // System.out.println();
        }
	}
}

