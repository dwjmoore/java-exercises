// See exercise 125 for Node and BinaryTree Classes, as well as for the inOrderTraversal function.

public class Basic1_130 {
	public void main() {
		System.out.println(
				"Write a Java program to find the maximum depth of a given a binary tree.");

		BinaryTree tree = new BinaryTree();

		tree.addNode(50);
		tree.addNode(25);
		tree.addNode(75);
		tree.addNode(12);
		tree.addNode(37);
		tree.addNode(43);

		int maxDepth = tree.maxDepth(tree.root);

		System.out.println("The Maximum depth of the binary tree is: " + maxDepth + ".");
	}
}