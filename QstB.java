/*2. Print right nodes only using iterative code.*/
package WEEK4;
import java.util.*;
// A class to store a binary tree node
class Node{
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

class Qst2{
    public static void printRightView(Node root){

        if (root == null) {
            return;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);


        Node curr = null;


        while (!q.isEmpty()){
            int size = q.size();
            int i = 0;
            while (i++ < size){
                curr = q.poll();
                if (i == size) {
                    System.out.print(curr.data + " ");
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);

        printRightView(root);
    }
}

