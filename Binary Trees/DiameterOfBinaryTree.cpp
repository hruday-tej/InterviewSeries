class Solution {
    pair<int,int> dfs(TreeNode* root)
    {
        if(root==NULL)
        {
            return {0,0};
        }
        pair<int,int> left=dfs(root->left);
        pair<int,int> right=dfs(root->right);
        int dia=max({left.first,right.first,left.second+right.second});
        return {dia,1+max(left.second,right.second)};
    }
public:
    int diameterOfBinaryTree(TreeNode* root) {
        return dfs(root).first;
    }
};
