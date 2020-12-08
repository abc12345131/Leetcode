/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
public:
    pair<bool,int> helper(TreeNode* root)
    {
        if(!root)
            return {true,-1};
        pair<bool,int> lt=helper(root->left);
        if(lt.first==false)
            return {false,-1};
        pair<bool,int> rt=helper(root->right);
        if(rt.first==false || abs(lt.second-rt.second)>1)
            return {false,-1};
        return {true,1+max(lt.second,rt.second)};
    }
    
    bool isBalanced(TreeNode* root)
    {
        if(!root)
            return true;
        pair<bool,int> res=helper(root);
        return res.first;
    }
};