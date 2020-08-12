//brute force is arr[i] = arr[n-i-1];

//next is stack 

//next is 2 pointer

class Solution {
    public void reverseString(char[] s) {
        
//         *** HERE WE ARE USING STACK SO NOT O(1) *****
//         Stack stack = new Stack();
//         for(char i : s){
//             stack.push(i);
//         }
//         int n = s.length;
//         // char[] s1 = new char[n];
//         for(int i=0;i<n;i++){
//             // System.out.println(stack.pop());
//             s[i] = (char)stack.pop();
//         }
        
//         // return s1;
        
//         ** This is in O(1)
        
        int n = s.length;
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            
            start++;
            end--;
        }
    }
}