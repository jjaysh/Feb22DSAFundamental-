/*"Implement binary Tree class and insert few numbers into it and
 * perform the following :
2. Finding height of a tree.
"*/
package WEEK4;

import java.util.*;
public class Qst2{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    public Qst2(){
        root = null;
    }


    public int findHeight(Node tenpVar){
        if(root == null) {
            System.out.println("Tree is empty");
            return 0;
        }
        else {
            int leftHeight = 0, rightHeight = 0;
            if(tenpVar.left != null)
                leftHeight = findHeight(tenpVar.left);
            if(tenpVar.right != null)
                rightHeight = findHeight(tenpVar.right);
            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;
            return (max + 1);
        }
    }

    public static void main(String[] args) {

        Qst2 bt = new Qst2();
        //Add nodes to the binary tree
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.right.left = new Node(5);
        bt.root.right.right = new Node(6);
        bt.root.right.right.right= new Node(7);
        bt.root.right.right.right.right = new Node(8);
        System.out.println("Maximum height of given binary tree: " + bt.findHeight(bt.root));
    }
}


