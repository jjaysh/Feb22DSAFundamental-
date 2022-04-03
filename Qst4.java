
/*"Implement binary Tree class and insert few numbers into it and
 * perform the following :
4. Print only the leaf nodes in a binary Tree.
"*/
package WEEK4;


public class Qst4{

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static void printLeafNodes(Node node) {

        if(node==null)
            return;

        if(node.left == null && node.right == null) {
            System.out.println(node.data);
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    public static void main(String[] args){
        Node rootNode=createBinaryTree();
        System.out.println("Printing leaf nodes in binary tree :");
        printLeafNodes(rootNode);
    }

    public static Node createBinaryTree()
    {

        Node rootNode =new Node(40);
        Node node20=new Node(20);
        Node node10=new Node(10);
        Node node30=new Node(30);
        Node node60=new Node(60);
        Node node50=new Node(50);
        Node node70=new Node(70);
        Node node5=new Node(5);
        Node node55=new Node(55);

        rootNode.left=node20;
        rootNode.right=node60;

        node20.left=node10;
        node20.right=node30;

        node60.left=node50;
        node60.right=node70;

        node10.left=node5;
        node50.right=node55;
        return rootNode;
    }
}
