package Tree;

import java.util.*;

public class BinaryTreesYT {
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

	public static void preorder(Node root) {
		if (root == null) {
			return;
			// System.out.println("It is null");
		}
		System.out.println(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	// output: 1,2,4,5,3,6

	public static void inorder(Node root) {
		if (root == null) {
			return;
		}
		// System.out.println();
		inorder(root.left);
		System.out.println(root.data + " ");
		inorder(root.right);
	} // output: 4,2,5,1,3,6

	public static void postorder(Node root) {
		if (root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data + " ");
		// output: 4,5,2,6,3,1
	}

/**	public static void levelorder(Node root) {
		if (root == null) {
			return;
		}
		// creating queue by making object
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			Node currNode = q.remove();
			if (currNode == null) {
				System.out.println();

				if (!q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.println(currNode.data + " ");
				if (currNode.left != null) {
					q.add(currNode.left);
				}
				if (currNode.right != null) {
					q.add(currNode.right);
				}
			} **/





	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		 //System.out.println("The root node is:"+root.data);
		// Time complexity of these traversal is Big 0(n).
		// preorder(root);
		//inorder(root);
		 postorder(root);
		//levelorder(root);
	}
}
