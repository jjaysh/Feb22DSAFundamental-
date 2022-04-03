package WEEK4;

public class lowestCommonAnscestor {
    
}


class NodeTwo {
    int data;
    Node left, right;

    NodeTwo(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    Node lca(NodeTwo nodeTwo, int n1, int n2) {
        if (nodeTwo == null)
            return null;

        if (nodeTwo.data > n1 && nodeTwo.data > n2)
            return lca(nodeTwo.left, n1, n2);

        if (nodeTwo.data < n1 && nodeTwo.data < n2)
            return lca(nodeTwo.right, n1, n2);

        return nodeTwo;
    }


    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);

        int n1 = 10, n2 = 14;
        NodeTwo t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

        n1 = 14;
        n2 = 8;
        t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

        n1 = 10;
        n2 = 22;
        t = tree.lca(tree.root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

    }
}
