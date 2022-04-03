/*4. https://leetcode.com/problems/path-sum/ */
package WEEK4;

public class QstC {

}

 class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {


        if(root==null)
        return false;
        Stack<TreeNode>node_stack=new Stack();
        Stack<Integer>sum_stack=new Stack();

        node_stack.add(root);
        sum_stack.add(sum-root.val);

        while(!node_stack.isEmpty()){
            TreeNode current_node=node_stack.pop();
            int current_sum=sum_stack.pop();

            if(current_node.left==null&&current_node.right==null&&current_sum==0){
                return true;
            }

            if(current_node.left!=null){
                node_stack.add(current_node.left);
                sum_stack.add(current_sum-current_node.left.val);
            }
            if(current_node.right!=null){
                 node_stack.add(current_node.right);
                sum_stack.add(current_sum-current_node.right.val);
            }
        }
        return true;
    }
}