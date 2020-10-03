class Solution {
    
    static int bs(int [] arr, int key, int l, int r){
        
        while(l<=r){
            
            int m = (l+r)/2;
            if(arr[m] == key){
                return m;
            }
            else if(arr[m]<key){
                l = m+1;
            }
            else{
                r = m-1;
            }
            
        }
        
        return -1;
    }
    
    public int[] twoSum(int[] nums, int target) {
//         brute force 
//         we try all possible pairs and add them and check if sum == target;
        
        int n = nums.length;
        
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]+nums[j] == target){
//                     int [] sol = new int[2];
//                     sol[0] = i;
//                     sol[1] = j;
                    
//                     return sol;
//                 }
//             }
//         }
        
//         int [] solution = new int[2];
//         solution[0]=-1;
//         solution[1] = -1;
        
//         return solution;
        
// //         time -> O(n^2)
// //         space -> O(1)
        
//         initally we'd sorting the nums;
        
//         fix + find = target
//         find = target - fix
        
//         Arrays.sort(nums);
        
//         for(int i=0;i<n;i++){
//             int fixed = nums[i];
            
//             int find = target-fixed;
            
//             int x = bs(nums, find, i+1,n-1);
//             if(x!=-1){
//                     int [] sol = new int[2];
//                     sol[0] = i;
//                     sol[1] = x;
                
//                 return sol;
//             }
//         }
        
//         int [] solution = new int[2];
//         solution[0]=-1;
//         solution[1] = -1;
        
//         return solution;
        
//         time -> O( nlog(n) + n(log(n)))
//         space -> O(1);      
        
        // {2,}
//         nums[i] = 7;
//         target - nums[i] = find
//         9 - 7 = 2 
//         find = 2
//         {
//         i=0 nums[i]=2  find = 9 - 2 = 7
//         7 in map;
//         (nums[i]=2, i=0);
//         i=1 nums[i]=7 find = 9-7 = 2
//         get(2) = 0
        // [1,0]
        
    // }
        
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int find = target - nums[i];
            
            if(map.containsKey(find)){
                    int [] sol = new int[2];
                    sol[0] = i;
                    sol[1] = map.get(find);
                
                return sol;
            }
            
            map.put(nums[i],i);
        }
        
        int [] solution = new int[2];
        solution[0]=-1;
        solution[1] = -1;
        
        return solution;
        
//         time -> O(n * 1)
//         space -> O(n)
    }
}
