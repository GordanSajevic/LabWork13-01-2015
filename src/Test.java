
public class Test {

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(5);
		tree.add(3);
		tree.add(7);
		tree.add(6);
		tree.add(3);
		tree.add(4);
		tree.printTree();
		System.out.println(tree.contains(3));
		
	}
}
