/*
1. PrintKthLevel nodes only for a binary tree.*/
package WEEK4;

import java.util.*;

class Qst1{
    static class node {
        int data;
        node left;
        node right;
    }

    static node newNode(int data){
        node temp = new node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    static void nodesAtKthLevel(node root,int k){

        if (root == null)
            return;
        Queue<node> q = new LinkedList<node>();
        q.add(root);
        HashSet<Integer> s = new HashSet<Integer>();
        int lvl = 0;
        int flag = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                node ptr = q.peek();
                q.remove();
                if (lvl == k){
                    flag = 1;
                    s.add(ptr.data);
                }
                else {
                    if (ptr.left!=null)
                        q.add(ptr.left);


                    if (ptr.right!=null)
                        q.add(ptr.right);
                }
            }


            lvl++;
            if (flag == 1)
                break;
        }
        for (int it : s) {
            System.out.print(it+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        node root = new node();
        root = newNode(60);
        root.left = newNode(20);
        root.right = newNode(30);
        root.left.left = newNode(80);
        root.left.right = newNode(10);
        root.right.left = newNode(40);
        int level = 1;
        nodesAtKthLevel(root, level);

    }
}




