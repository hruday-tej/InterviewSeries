/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int left = 0;
        int right = n-1;
        
        while  (left<=right){
            if(arr[left] <0 && arr[right]<0){
                left++;
            }
            else if(arr[left]>0 && arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                
                right--;
            }
            else if(arr[left]<0 && arr[right]>0){
                left++;
            }
            else{
                right--;
            }
            
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        
	}
}
