class Solution {
public:
    int FindMax(vector<int>& nums,int l,int h)
    {
        int idx=-1;
        int m=INT_MIN;
        for(int i=l;i<=h;i++)
        {
            if(nums[i]>m)
            {
                idx=i;
                m=nums[i];
            }
        }
        return idx;
    }
    TreeNode* Find(vector<int>& nums,int l,int h)
    {
        if(l>h)
        {
            return NULL;
        }
        int idx=FindMax(nums,l,h);
        TreeNode* root=new TreeNode(nums[idx]);
        root->left=Find(nums,l,idx-1);
        root->right=Find(nums,idx+1,h);
        return root;
    }
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
        
        int n=nums.size();
        return Find(nums,0,n-1);
    }
};