
public class BinarySearchTree {
	
	private Node root;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public BinarySearchTree()
	{
		this.root = null;
	}
	
	/**
	 * Rekurzivna metoda koja dodaje nove elemente rekurzivno
	 * @param value
	 */
	
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
	
	/**
	 * Rekurzivna metoda koja ispisuje sve elemente
	 */
	
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
	/**
	 * Rekurzivna metoda koja ispituje da li stablo sadrži jedan određeni element
	 * @param value
	 * @return
	 */
	
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
	
	/**
	 * Node klasa
	 * @author gordansajevic
	 *
	 */
	
	private class Node
	{
		private int value;
		private Node left;
		private Node right;
		
		/**
		 * Konstruktor sa jednim parametrom
		 * @param value
		 */
		
		public Node(int value)
		{
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

}
