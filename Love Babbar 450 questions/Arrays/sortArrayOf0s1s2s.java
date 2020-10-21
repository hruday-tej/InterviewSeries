/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- >0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		  //  int z=0;
		  //  int o = 0;
		  //  int to = 0;
		  //  for(int i:arr){
		  //      if(i==0)z++;
		  //      else if(i==1)o++;
		  //      else to++;
		  //  }
	   //     while(z-- >0){
	   //         System.out.print("0 ");
	   //     }
	   //     while(o-- >0){
	   //         System.out.print("1 ");
	   //     }
	   //     while(to-- >0){
	   //         System.out.print("2 ");
	   //     }
	        
	   //     System.out.println();
	   
	   // DUTCH FLAG PROBLEM
	   
	        int l=0;
	        int m=0;
	        int h=n-1;
	        while(m<=h){
	            if(arr[m]==0){
	                int temp = arr[l];
	                arr[l] = arr[m];
	                arr[m] = temp;
	                m++;
	                l++;
	            }
	            else if(arr[m]==1){
	                m++;
	            }
	            else{
	                int temp = arr[h];
	                arr[h] = arr[m];
	                arr[m] = temp;
	               // m++;
	                h--;
	            }
	        }
	        for(int i:arr){
	            System.out.print(i+" ");
	        }
	        
	        System.out.println();
		}
		
	}
}
