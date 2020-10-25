class Solution {
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // for(int i=0;i<n-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;
        
        // int sum =0;
        // int max = nums[0];
        // HashSet<Integer> set = new HashSet<>();
        // for(int i:nums){
        //     // sum+=i;
        //     // if(i>=max){
        //     //     max = i;
        //     // }
        //     if(set.contains(i)){
        //         return i;
        //     }
        //     else{
        //         set.add(i);
        //     }
        // }
        // return -1;
        // // return Math.abs(sum - ((max*(max+1))/2));
        
//         TORTOISE AND HARE
        
        int tortoise = nums[0];
        int hare = nums[nums[0]];
        
        while(tortoise != hare){
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        }
        
        tortoise = nums[0];
        while(tortoise != hare){
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        
        return hare;
    }
}
