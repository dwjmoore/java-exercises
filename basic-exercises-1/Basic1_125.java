public class Basic1_125 {
	public void main() {
		System.out.println(
				"Write a Java program to get the preorder traversal of its nodes' values of a given a binary tree.");

		BinaryTree tree = new BinaryTree();

		tree.addNode(50);
		tree.addNode(25);
		tree.addNode(75);
		tree.addNode(12);
		tree.addNode(37);
		tree.addNode(43);
		tree.addNode(30);
	
		tree.preOrderTraversal(tree.root);
	}
}

class Node {
	int data;
	Node left;
	Node right;
	
	public Node(int data) {
		this.data = data;
	}
}

class BinaryTree {
	Node root;

	public void addNode(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;

				if (data < focusNode.data) {
					focusNode = focusNode.left;
					if (focusNode == null) {
						parent.left = newNode;
						return;
					}
				} else {
					focusNode = focusNode.right;
					if (focusNode == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}

	public void preOrderTraversal(Node focusNode) {
		if (focusNode != null) {
			System.out.print(focusNode.data + " ");
			preOrderTraversal(focusNode.left);
			preOrderTraversal(focusNode.right);
		}
	}

	public void inOrderTraversal(Node focusNode) {
		if (focusNode != null) {
			inOrderTraversal(focusNode.left);
			System.out.print(focusNode.data + " ");
			inOrderTraversal(focusNode.right);
		}
	}

	public void postOrderTraversal(Node focusNode) {
		if (focusNode != null) {
			postOrderTraversal(focusNode.left);
			postOrderTraversal(focusNode.right);
			System.out.print(focusNode.data + " ");
		}
	}
}