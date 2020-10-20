/*
BRUTE FORCE - for every element check if it repeates n/2 times
HASHMAP - count
SORTING - after sorting the (n/2)th element is the majority element
VOTES - 
	initially select one candidate then do this
	if same:
		count ++
	else:
		count--
		if(count==0):
			update candidate
*/


class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count = 1;
        for(int i:nums){
            if (i==candidate){
                count++;
            }
            else{
                count--;
                if (count == 0){
                    candidate = i;
                    count = 1;
                }
            }
        }
        
        // for(int i=1;i<nums.length; i++){
        //     if(nums[i]==candidate)count++;
        //     else{
        //         count--;
        //         if (count==0){
        //             candidate = nums[i];
        //             count = 1;
        //         }
        //     }
        // }
        
        
//         we cannot assume that candidate element is alwas there
        int count2 = 0;
        for (int i:nums){
            if (candidate==i){
                count2++;
            }
        }
        
        if (count2>(int)(nums.length)/2)return candidate;
        else return -1;
        // return candidate;
    }
}
