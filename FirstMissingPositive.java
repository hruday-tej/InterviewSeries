class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        
        for(int i:nums){
            set.add(i);
        }
        
        for(int i=1;i<Integer.MAX_VALUE;i++){
            if (!set.contains(i)){
                return i;
            }
        }
    return Integer.MAX_VALUE;
    }
    
}
