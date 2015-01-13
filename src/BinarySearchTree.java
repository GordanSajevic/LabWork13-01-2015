
public class BinarySearchTree {
	
	private Node root;
	
	public BinarySearchTree()
	{
		this.root = null;
	}
	
	public void add(int value)
	{
		if (root == null)
		{
			root = new Node(value);
		}
		else
		{	
			add(value, root);
		}
	}
	
	private void add(int value, Node current)
	{
		if (value <= current.value)
		{
			if (current.left == null)
			{
				current.left = new Node(value);
				return;
			}
			add(value, current.left);
		}
		else
		{
			if (current.right == null)
			{
				current.right = new Node(value);
				return;
			}
			add(value, current.right);
		}
		
	}
	
	public void printTree()
	{
		if (root == null)
		{
			throw new IndexOutOfBoundsException("Tree is empty!");
		}
		printTree(root);
	}
	
	public void printTree(Node current)
	{
		if (current == null)
		{
			return;
		}
		printTree(current.left);
		System.out.println(current.value);
		printTree(current.right);
	}
	
	public boolean contains(int value)
	{
		return contains(value, root);
	}
	
	private boolean contains(int value, Node current)
	{
		if (current.left == null || current.right == null)
		{
			return false;
		}
		else
		{
			if (value < current.value)
			{
				if (current.left.value == value)
				{
					return true;
				}
				contains(value, current.left);
			}
			else
			{
				if (current.right.value == value)
				{
					return true;
				}
				contains(value, current.right);
			}
		}
		return false;
	}
	
	private class Node
	{
		private int value;
		private Node left;
		private Node right;
		
		public Node(int value)
		{
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

}
