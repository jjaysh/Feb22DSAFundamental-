/*"Implement binary Tree class and insert few numbers into it and
 * perform the following :
5. Sum all the nodes values and print the final sum on the screen."*/
package WEEK4;

public class Qst5{

    static class Node{
        int data;
        Node left, right;
    }
    static Node newNode(int data){
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }


    static int add(Node root){
        if (root == null)
            return 0;
        return (root.data + add(root.left) + add(root.right));
    }


    public static void main(String args[]){
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(6);
        root.right.right = newNode(7);
        root.right.left.right = newNode(8);

        int sum = add(root);
        System.out.println("Sum of all the elements is: " + sum);
    }
}


