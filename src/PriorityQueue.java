
public class PriorityQueue {
	
	private Node head;
	private Node tail;
	
	/**
	 * Konstruktor bez parametara
	 */
	
	public PriorityQueue()
	{
		this.head = head;
		this.tail = tail;
	}
	
	/**
	 * Metoda koja dodaje novi element sortirano po priority varijabli
	 * @param value
	 * @param priority
	 */
	
	public void push(int value, int priority)
	{
		Node newNode = new Node(value, priority);
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			if (head.priority <= newNode.priority)
			{
				newNode.next = head;
				head = newNode;
				return;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
			}
		}
	}
	
	/**
	 * Metoda koja uklanja prvi element i ispisuje njegovu vrijednost
	 * @return value
	 */
	
	public int pop()
	{
		if (isEmpty() == true)
		{
			throw new NullPointerException("Queue is empty!");
		}
		if (head == tail)
		{
			tail = null;
		}
		int value = head.value;
		head = head.next;
		return value;
	}
	
	/**
	 * Metoda koja ispisuje prvi element
	 * @return value
	 */
	
	public int peek()
	{
		if (isEmpty() == true)
		{
			throw new NullPointerException("Queue is empty!");
		}
		return head.value;
	}
	
	/**
	 * Metoda koja provjerava da li je lista prazna
	 * @return boolean
	 */
	
	public boolean isEmpty()
	{
		if (head == null)
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Metoda koja vraća string sa svim elementima
	 */
	
	public String toString()
	{
		String str = "";
		Node current = head;
		while (current != null)
		{
			str += current.value + " ";
			current = current.next;
		}
		return str;
	}
	
	/**
	 * Node klasa
	 * @author gordansajevic
	 *
	 */
	
	private class Node
	{
		private int value;
		private Node next;
		private int priority;
		
		/**
		 * Konstruktor sa dva parametra
		 * @param value
		 * @param priority
		 */
		
		public Node(int value, int priority)
		{
			this.value = value;
			this.priority = priority;
			this.next = null;
		}
		
		/**
		 * Konstruktor sa tri parametra
		 * @param value
		 * @param priority
		 * @param next
		 */
		
		public Node(int value, int priority, Node next)
		{
			this.value = value;
			this.priority = priority;
			this.next = next;
		}
	}

}
