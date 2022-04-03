/*"Implement binary Tree class and insert few numbers into it and perform the following :
1. Inorder , pre-order and post order traversal using recursion. "*/
package march.week4.assignment14;
import java.util.*;
public class Q1 {
    private Node root;
    Q1(){
        root = null;
    }
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int value){
            this.data = value;
            left = null;
            right = null;
        }
        public void displayData()
        {
            System.out.print(data + " ");
        }
    }

    public void insert(int i){
        root = insert(root, i);
    }

    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }

        if(value < node.data)
        {
            node.left = insert(node.left, value);
        }

        else if(value > node.data)
        {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public Node find(int searchedValue){
        Node current = root;
        while(current.data != searchedValue){
            if(searchedValue < current.data)
                current = current.left;
            else
                current = current.right;
            if(current == null){
                return null;
            }
        }
        return current;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            node.displayData();
            inOrder(node.right);
        }
    }

    public void preOrder(Node node){
        if(node != null){
            node.displayData();
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            node.displayData();
        }
    }
    public static void main(String[] args){
        Qst1 bst = new Qst1();
        bst.insert(34);
        bst.insert(56);
        bst.insert(12);
        bst.insert(89);
        bst.insert(67);
        bst.insert(90);
        System.out.println("Inorder traversal of binary tree");
        bst.inOrder(bst.root);
        System.out.println();
        System.out.println("Preorder traversal of binary tree");
        bst.preOrder(bst.root);
        System.out.println();
        System.out.println("Postorder traversal of binary tree");
        bst.postOrder(bst.root);
        System.out.println();
    }
}