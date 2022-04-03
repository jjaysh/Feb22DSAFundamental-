/*3. Level order traversal  in both (Recursive + Iterative)*/
package WEEK4;

// Levelorder traversal of Binary Tree in Recursive way
class Node1 {
    int data;
    Node1 left, right;

    Node1(int data){
        this.data = data;
        left = right = null;
    }
}

class Qst3A {
    Node1 root;

    public Qst3A(){
        root = null;
    }

    void printLevelOrder(){
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }

    int height(Node1 root){
        if (root == null)
            return 0;
        else {

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }

    void printCurrentLevel(Node1 root, int level){
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    public static void main(String args[]){
        Qst3A tree = new Qst3A();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }
}