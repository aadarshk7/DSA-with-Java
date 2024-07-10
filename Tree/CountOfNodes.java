package Tree;

public class CountOfNodes {
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
        static int idx = -1;

        public static Node Buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = Buildtree(nodes);
            newNode.right = Buildtree(nodes);
            return newNode;
        }
    }

    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        CountOfNodes.BinaryTree tree = new CountOfNodes.BinaryTree();
        Node root = tree.Buildtree(nodes);
        System.out.println(countOfNodes((root)));
    }
}
