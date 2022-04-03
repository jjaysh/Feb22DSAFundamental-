package WEEK4;

public class QstD {
    
}
 /* https://leetcode.com/problems/average-of-levels-in-binary-tree/ */
 
 
  class Solution {
     public List<Double> averageOfLevels(TreeNode root) {
         List<Double> result=new ArrayList();
         if(root==null)
             return result;
 
         Queue<TreeNode> queue =new LinkedList();
         queue.offer(root);
 
         double level_sum=0;
         while(!queue.isEmpty()){
             level_sum=0;
 
             int size=queue.size();
             for(int i=0;i<size;i++){
                 TreeNode current_node=queue.poll();
                 level_sum+=current_node.val;
                 if(current_node.left!=null)
                     queue.offer(current_node.left);
                 if(current_node.right!=null)
                     queue.offer(current_node.right);
             }
             double level_avg=level_sum/size;
             result.add(level_avg);
         }
             return result;
     }
 }