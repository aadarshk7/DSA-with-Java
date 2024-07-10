package Tree;

public class SumOfNodes {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    static class BinaryTree {
        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static int sumofnodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumofnodes(root.left);
        int rightSum = sumofnodes(root.right);
        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree sn = new BinaryTree();
        Node root = sn.buildTree(nodes);
        System.out.println(sumofnodes(root));


    }


}
