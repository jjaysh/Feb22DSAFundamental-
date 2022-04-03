package WEEK4;

public class QstE {
    
}/*  https://leetcode.com/problems/leaf-similar-trees/ */


  class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1=new ArrayList();
        List<Integer> l2=new ArrayList();
        dfs(l1,root1);
        dfs(l2,root2);

    }
    public void dfs(List<Integer> leafVal,TreeNode root){
        if(root==null){
             return;
        }

        if(root.left==null&&root.right==null){
            leafVal.add(root.val);
        }
             dfs(leafVal,root.left);
             dfs(leafVal,root.right);
    }
}
