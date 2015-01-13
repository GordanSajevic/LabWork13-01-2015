
public class MyTree {
	
	private String data;
	private MyTree left;
	private MyTree right;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public MyTree()
	{
		this.data = null;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * Konstruktor sa jednim parametrom
	 * @param data
	 */
	
	public MyTree(String data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
		
	}
	
	/**
	 * Rekurzivna metoda koja dodaje elemente sortirano
	 * @param data
	 */
	
	public void add(String data)
	{
		if (this.data.compareToIgnoreCase(data) < 0)
		{
			if (left == null)
			{
				left = new MyTree(data);
			}
			else
			{
				left.add(data);
			}
		}
		else
		{
			if (right == null)
			{
				right = new MyTree(data);
			}
			else
			{
				right.add(data);
			}
		}
	}
	
	/**
	 * Rekurzivna metoda koja ispisuje elemente (preOrder)
	 */
	
	public void preOrderPrint()
	{
		System.out.println(data);
		if (left != null)
		{
			left.preOrderPrint();
		}
		if (right != null)
		{
			right.preOrderPrint();
		}
	}
	
	/**
	 * Rekurzivna metoda koja ispisuje elemente (postOrder)
	 */
	
	public void postOrderPrint()
	{
		System.out.println(data);
		if (left != null)
		{
			left.postOrderPrint();
		}
		if (right != null)
		{
			right.postOrderPrint();
		}
		System.out.println(data);
	}
	
	/**
	 * Rekurzivna metoda koja ispisuje elemente (inOrder)
	 */
	
	public void inOrderPrint()
	{
		System.out.println(data);
		if (left != null)
		{
			left.inOrderPrint();
		}
		if (right != null)
		{
			right.inOrderPrint();
		}
		System.out.println(data);
	}
	

}
