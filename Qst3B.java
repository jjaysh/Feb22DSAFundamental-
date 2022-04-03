  /*3. Level order traversal  in both (Recursive + Iterative)*/
package WEEK4;

// level order traversal by iterative way

import java.util.*;

class Node2{
    int data;
    Node2 left, right;

    public Node2(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Qst3B {

    Node2 root;
    void printLevelOrder(){
        Queue<Node2> q = new LinkedList<Node2>();
        q.add(root);
        while (!q.isEmpty()) {
            Node2 tmpNode = q.poll();
            System.out.print(tmpNode.data + " ");
            if (tmpNode.left != null) {
                q.add(tmpNode.left);
            }
            if (tmpNode.right != null) {
                q.add(tmpNode.right);
            }
        }
    }

    public static void main(String args[]){
        Qst3B t = new Qst3B();
        t.root = new Node2(1);
        t.root.left = new Node2(2);
        t.root.right = new Node2(3);
        t.root.left.left = new Node2(4);
        t.root.left.right = new Node2(5);

        System.out.println("Level order traversal of binary tree is - ");
        t.printLevelOrder();
    }
}

