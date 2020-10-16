class Solution {
public:
    int rob(vector<int>& nums) {
        int n=nums.size();
        if(n==0)
        {
            return 0;
        }
        int dpR[n];
        int dpN[n];
        dpR[0]=nums[0];
        dpN[0]=0;
        for(int i=1;i<n;i++)
        {
            dpR[i]=max(nums[i]+dpN[i-1],dpR[i-1]);
            dpN[i]=dpR[i-1];
        }
        return max(dpR[n-1],dpN[n-1]);
    }
};
