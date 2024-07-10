package Tree;

public class Node {
    String name;
    Node left;
    Node right;

    Node(String Name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        A.left = B;
        A.right = C;
        B.left = E;
        B.right = F;
        C.left = D;
        C.right = null;
        E.right = null;
        F.right = null;


    }
}
