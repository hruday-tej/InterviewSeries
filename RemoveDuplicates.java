class Solution {
    public int removeDuplicates(int[] arr) {
        // int n = arr.length;
        // if(n==0)return 0;
        // int i=0;
        // int prev=arr[0];
        // int len = 1;
        // while(i<n){
        //     if(arr[i] == prev){
        //         i++;
        //         continue;
        //     }            
        //     else{
        //         len++;
        //         prev=arr[i];
        //         arr[len-1]=prev;
        //         i++;
        //     }
        // }
        // System.out.println(len);
        // return len;
        int[] nums = arr;
        
        if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
    }
}
