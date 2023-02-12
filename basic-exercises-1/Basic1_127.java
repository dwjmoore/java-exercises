// See exercise 125 for Node and BinaryTree Classes, as well as for the postOrderTraversal function.

public class Basic1_127 {
	public void main() {
		System.out.println(
				"Write a Java program to get the Postorder traversal of its nodes' values of a given a binary tree.");

		BinaryTree tree = new BinaryTree();

		tree.addNode(50);
		tree.addNode(25);
		tree.addNode(75);
		tree.addNode(12);
		tree.addNode(37);
		tree.addNode(43);
		tree.addNode(30);
	
		tree.postOrderTraversal(tree.root);
	}
}